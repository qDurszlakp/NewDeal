package com.sandbox.api.service;

import com.sandbox.api.common.CommonResultsManager;
import com.sandbox.api.mapper.ApiCountryMapper;
import com.sandbox.api.model.Country;
import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.domain.model.DomainCountry;
import com.sandbox.domain.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApiCountryServiceImpl implements ApiCountryService {

    private final ApiCountryMapper apiCountryMapper;
    private final CountryService countryService;

    @Override
    public GetCountriesResponse getCountries() {

        List<DomainCountry> domainCountries = countryService.getCountries();

        List<Country> apiCountries = domainCountries.stream()
                .map(apiCountryMapper::map)
                .collect(Collectors.toList());

        GetCountriesResponse result = new GetCountriesResponse();
        result.setCountries(apiCountries);
        result.setResult(CommonResultsManager.SUCCESS);

        return result;
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
