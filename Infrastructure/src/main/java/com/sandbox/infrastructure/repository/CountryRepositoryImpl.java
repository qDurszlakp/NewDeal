package com.sandbox.infrastructure.repository;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.repository.CountryRepository;
import com.sandbox.infrastructure.entity.Country;
import com.sandbox.infrastructure.mapper.InfrastructureCountryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class CountryRepositoryImpl implements CountryRepository {

    private final Clock clock;
    private final CountryJpaRepository countryJpaRepository;
    private final InfrastructureCountryMapper infrastructureCountryMapper;

    @Override
    public List<DomainCountry> getCountries() {

        List<Country> countries = countryJpaRepository.findAll();

        return countries.stream()
                .map(infrastructureCountryMapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public void save(DomainCountry domainCountry) {
        Country country = infrastructureCountryMapper.map(domainCountry);
        country.setInsertTime(LocalDateTime.now(clock));
        countryJpaRepository.save(country);
    }

    @Override
    @Transactional
    public void update(DomainCountry domainCountry) {

        Optional<Country> countryByCode = countryJpaRepository.findCountryByCode(domainCountry.getCode());

        if (!countryByCode.isPresent()) {
            throw new RuntimeException(String.format("No country with code %s, available.", domainCountry.getCode()));
        }

        Country country = countryByCode.get();
        country.setInsertTime(domainCountry.getInsertTime());
        country.setName(domainCountry.getName());

        countryJpaRepository.save(country);
    }
}
