package com.sandbox.domain.service;

import com.sandbox.domain.model.DomainCountry;

import java.util.List;

public interface CountryService {

    List<DomainCountry> getCountries();

    void addCountry(DomainCountry domainCountry);

    void editCountry(DomainCountry domainCountry);
}
