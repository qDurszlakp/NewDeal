package com.sandbox.infrastructure.repository;

import com.sandbox.domain.model.DomainAccount;
import com.sandbox.domain.repository.AccountRepository;
import com.sandbox.infrastructure.entity.Account;
import com.sandbox.infrastructure.mapper.InfrastructureAccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;
    private final InfrastructureAccountMapper infrastructureAccountMapper;

    @Override
    public List<DomainAccount> getAccounts() {

        List<Account> accounts = accountJpaRepository.findAll();

        return accounts.stream()
                .map(infrastructureAccountMapper::map)
                .collect(Collectors.toList());
    }
}
