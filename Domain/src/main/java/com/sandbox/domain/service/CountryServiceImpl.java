package com.sandbox.domain.service;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.repository.CountryRepository;

import java.time.LocalDateTime;
import java.util.List;

public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<DomainCountry> getCountries() {
        return countryRepository.getCountries();
    }

    @Override
    public void addCountry(DomainCountry domainCountry) {
        countryRepository.save(domainCountry);
    }

    @Override
    public void editCountry(DomainCountry domainCountry) {

        if (domainCountry.getInsertTime() == null) {
            domainCountry.setInsertTime(LocalDateTime.now());
        }

        countryRepository.update(domainCountry);
    }
}
