package com.sandbox.infrastructure.repository;

import com.sandbox.domain.model.DomainCard;
import com.sandbox.domain.repository.CardRepository;
import com.sandbox.infrastructure.entity.Card;
import com.sandbox.infrastructure.mapper.InfrastructureCardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class CardRepositoryImpl implements CardRepository {

    private final CardJpaRepository cardJpaRepository;
    private final InfrastructureCardMapper infrastructureCardMapper;

    @Override
    @Cacheable("cards")
    public List<DomainCard> getCards() {

        List<Card> cards = cardJpaRepository.findAll();

        return cards.stream()
                .map(infrastructureCardMapper::map)
                .collect(Collectors.toList());
    }
}
