package com.sandbox.api.controller;

import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.api.service.ApiCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final ApiCountryService apiCountryService;

    @GetMapping("/getAllCountries")
    public ResponseEntity<GetCountriesResponse> getAllCountries() {
        GetCountriesResponse apiResponse = apiCountryService.getAllCountries();
        return ResponseEntity.ok(apiResponse);
    }

}

