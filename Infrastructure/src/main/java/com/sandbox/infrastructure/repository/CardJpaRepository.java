package com.sandbox.infrastructure.repository;

import com.sandbox.infrastructure.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardJpaRepository extends JpaRepository<Card, Long> {
}
