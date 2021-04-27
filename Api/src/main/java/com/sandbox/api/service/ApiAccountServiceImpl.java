package com.sandbox.api.service;

import com.sandbox.api.common.CommonResultsManager;
import com.sandbox.api.mapper.ApiAccountMapper;
import com.sandbox.api.model.Account;
import com.sandbox.api.model.GetAccountsResponse;
import com.sandbox.domain.model.DomainAccount;
import com.sandbox.domain.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApiAccountServiceImpl implements ApiAccountService {

    private final AccountService accountService;
    private final ApiAccountMapper apiAccountMapper;

    @Override
    public GetAccountsResponse getAccounts() {

        List<DomainAccount> domainAccounts = accountService.getAccounts();

        List<Account> apiAccounts = domainAccounts.stream()
                .map(apiAccountMapper::map).collect(Collectors.toList());

        GetAccountsResponse result = new GetAccountsResponse();
        result.setAccounts(apiAccounts);
        result.setResult(CommonResultsManager.SUCCESS);

        return result;
    }
}
