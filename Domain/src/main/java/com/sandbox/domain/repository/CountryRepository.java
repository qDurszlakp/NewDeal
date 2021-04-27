package com.sandbox.domain.repository;

import com.sandbox.domain.model.DomainCountry;

import java.util.List;

public interface CountryRepository {

    List<DomainCountry> getCountries();

    void save(DomainCountry domainCountry);

    void update(DomainCountry domainCountry);
}
