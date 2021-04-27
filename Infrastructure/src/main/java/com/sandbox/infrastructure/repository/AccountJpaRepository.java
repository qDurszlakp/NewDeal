package com.sandbox.infrastructure.repository;

import com.sandbox.infrastructure.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<Account, Long> {

}
