package com.sandbox.infrastructure.repository;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.model.DomainGetCountriesResponse;
import com.sandbox.domain.repository.CountryRepository;
import com.sandbox.infrastructure.entity.Country;
import com.sandbox.infrastructure.mapper.InfrastructureCountryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CountryRepositoryImpl implements CountryRepository {

    private final CountryJpaRepository countryJpaRepository;
    private final InfrastructureCountryMapper infrastructureCountryMapper;

    @Override
    public Optional<DomainGetCountriesResponse> getAllCountries() {

        List<Country> countries = countryJpaRepository.findAll();

        if (CollectionUtils.isEmpty(countries)) {
            return Optional.empty();
        }

        List<DomainCountry> mappedCountries = infrastructureCountryMapper.map(countries);

        DomainGetCountriesResponse result = new DomainGetCountriesResponse();
        result.setCountries(mappedCountries);

        return Optional.of(result);
    }

    @Override
    public void save(DomainCountry domainCountry) {
        Country country = infrastructureCountryMapper.map(domainCountry);
        countryJpaRepository.save(country);
    }
}
