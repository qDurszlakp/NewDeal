package com.sandbox.api.controller;

import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.api.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/getAllCountries")
    public ResponseEntity<GetCountriesResponse> getAllCountries() {
        return ResponseEntity.ok(countryService.getCountries());
    }

}
