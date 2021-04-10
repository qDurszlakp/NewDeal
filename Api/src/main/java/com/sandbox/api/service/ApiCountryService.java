package com.sandbox.api.service;

import com.sandbox.api.model.Country;
import com.sandbox.api.model.GetCountriesResponse;

public interface ApiCountryService {

    GetCountriesResponse getAllCountries();

    void addCountry(Country country);

    void editCountry(Country country);
}
