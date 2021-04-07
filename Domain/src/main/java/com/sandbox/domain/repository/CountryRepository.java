package com.sandbox.domain.repository;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.model.DomainGetCountriesResponse;

import java.util.Optional;

public interface CountryRepository {

    Optional<DomainGetCountriesResponse> getAllCountries();

    void save(DomainCountry domainCountry);
}
