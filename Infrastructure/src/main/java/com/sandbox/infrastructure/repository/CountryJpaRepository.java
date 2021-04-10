package com.sandbox.infrastructure.repository;

import com.sandbox.infrastructure.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryJpaRepository extends JpaRepository<Country, Long> {

    Optional<Country> findCountryByCode(String code);

}
