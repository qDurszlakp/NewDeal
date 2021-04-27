package com.sandbox.domain.service;

import com.sandbox.domain.model.DomainAccount;
import com.sandbox.domain.repository.AccountRepository;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<DomainAccount> getAccounts() {
        return accountRepository.getAccounts();
    }
}
