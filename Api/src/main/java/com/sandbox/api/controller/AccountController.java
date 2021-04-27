package com.sandbox.api.controller;

import com.sandbox.api.model.GetAccountsResponse;
import com.sandbox.api.service.ApiAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final ApiAccountService accountService;

    @GetMapping("/getAccounts")
    public ResponseEntity<GetAccountsResponse> getAccounts() {
        GetAccountsResponse apiResponse = accountService.getAccounts();
        return ResponseEntity.ok(apiResponse);
    }

}

