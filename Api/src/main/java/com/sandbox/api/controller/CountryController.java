package com.sandbox.api.controller;

import com.sandbox.api.common.CommonResultsManager;
import com.sandbox.api.model.Country;
import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.api.model.base.BaseResponse;
import com.sandbox.api.service.ApiCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final ApiCountryService apiCountryService;

    @GetMapping("/getCountries")
    public ResponseEntity<GetCountriesResponse> getCountries() {
        GetCountriesResponse apiResponse = apiCountryService.getCountries();
        return ResponseEntity.ok(apiResponse);
    }

    @PostMapping("/addCountry")
    public ResponseEntity<BaseResponse> addCountry(@Valid @RequestBody Country country) {
        apiCountryService.addCountry(country);

        BaseResponse response = new BaseResponse();
        response.setResult(CommonResultsManager.SUCCESS);

        return ResponseEntity.ok(response);
    }

    @PutMapping ("/editCountry")
    public ResponseEntity<BaseResponse> editCountry(@Valid @RequestBody Country country) {

        apiCountryService.editCountry(country);

        BaseResponse response = new BaseResponse();
        response.setResult(CommonResultsManager.SUCCESS);

        return ResponseEntity.ok(response);
    }

}

