package com.sandbox.domain.service;

import com.sandbox.domain.model.DomainGetCountriesResponse;
import com.sandbox.domain.repository.CountryRepository;

import java.util.Optional;

public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public DomainGetCountriesResponse getAllCountries() {

        Optional<DomainGetCountriesResponse> countries = countryRepository.getAllCountries();

        if (countries.isPresent()) {
            return countries.get();
        }

        throw new RuntimeException("No country records available.");
    }
}