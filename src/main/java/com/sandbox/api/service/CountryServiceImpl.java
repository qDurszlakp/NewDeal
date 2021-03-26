package com.sandbox.api.service;

import com.sandbox.api.entity.Country;
import com.sandbox.api.mapper.CountryMapper;
import com.sandbox.api.model.CountryDto;
import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.api.repository.CountryRepository;
import com.sandbox.common.model.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    @Override
    public GetCountriesResponse getCountries() {

        List<Country> countries = countryRepository.findAll();

        List<CountryDto> countriesDto = countries.stream()
                .map(countryMapper::map)
                .collect(Collectors.toList());

        if (!CollectionUtils.isEmpty(countriesDto)) {
            GetCountriesResponse result = new GetCountriesResponse();
            result.setCountries(countriesDto);
            result.setResult(Result.of(Result.SUCCESS_CODE, "OK"));
            return result;
        }

        GetCountriesResponse result = new GetCountriesResponse();
        result.setResult(Result.of("-2", "No records found."));

        return result;
    }
}
