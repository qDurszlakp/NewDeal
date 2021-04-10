package com.sandbox.domain.service;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.model.DomainGetCountriesResponse;

public interface CountryService {

    DomainGetCountriesResponse getAllCountries();

    void addCountry(DomainCountry domainCountry);

    void editCountry(DomainCountry domainCountry);
}
