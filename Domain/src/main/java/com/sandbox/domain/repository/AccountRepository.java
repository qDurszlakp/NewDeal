package com.sandbox.domain.repository;

import com.sandbox.domain.model.DomainAccount;

import java.util.List;

public interface AccountRepository {

    List<DomainAccount> getAccounts();

}
