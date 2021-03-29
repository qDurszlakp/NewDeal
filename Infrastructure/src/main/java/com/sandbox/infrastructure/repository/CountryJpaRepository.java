package com.sandbox.infrastructure.repository;

import com.sandbox.infrastructure.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJpaRepository extends JpaRepository<Country, Long> {
}
