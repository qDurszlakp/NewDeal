package com.sandbox.api.service;

import com.sandbox.api.common.CommonResultsManager;
import com.sandbox.api.mapper.ApiCountryMapper;
import com.sandbox.api.model.Country;
import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.api.model.base.Result;
import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.model.DomainGetCountriesResponse;
import com.sandbox.domain.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiCountryServiceImpl implements ApiCountryService {

    private final ApiCountryMapper apiCountryMapper;
    private final CountryService countryService;

    @Override
    public GetCountriesResponse getAllCountries() {

        DomainGetCountriesResponse countries = countryService.getAllCountries();

        GetCountriesResponse mappedCountries = apiCountryMapper.map(countries);
        mappedCountries.setResult(CommonResultsManager.SUCCESS);

        return mappedCountries;
    }

    @Override
    public void addCountry(Country country) {
        DomainCountry domainCountry = apiCountryMapper.map(country);
        countryService.addCountry(domainCountry);
    }

    @Override
    public void editCountry(Country country) {
        DomainCountry domainCountry = apiCountryMapper.map(country);
        countryService.editCountry(domainCountry);
    }
}
