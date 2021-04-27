package com.sandbox.domain.repository;

import com.sandbox.domain.model.DomainCard;

import java.util.List;

public interface CardRepository {

    List<DomainCard> getCards();

}
