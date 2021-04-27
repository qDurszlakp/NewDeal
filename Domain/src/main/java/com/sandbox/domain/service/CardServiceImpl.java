package com.sandbox.domain.service;

import com.sandbox.domain.model.DomainCard;
import com.sandbox.domain.repository.CardRepository;

import java.util.List;

public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<DomainCard> getCards() {
        return cardRepository.getCards();
    }
}
