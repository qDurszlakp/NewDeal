package com.sandbox.api.service;

import com.sandbox.api.common.CommonResultsManager;
import com.sandbox.api.mapper.ApiCardMapper;
import com.sandbox.api.model.Card;
import com.sandbox.api.model.GetCardsResponse;
import com.sandbox.domain.model.DomainCard;
import com.sandbox.domain.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApiCardServiceImpl implements ApiCardService {

    private final CardService cardService;
    private final ApiCardMapper apiCardMapper;

    @Override
    public GetCardsResponse getCards() {

        List<DomainCard> domainCards = cardService.getCards();

        GetCardsResponse result = new GetCardsResponse();

        List<Card> apiCards = domainCards.stream()
                .map(apiCardMapper::map)
                .collect(Collectors.toList());

        result.setCards(apiCards);
        result.setResult(CommonResultsManager.SUCCESS);

        return result;
    }
}
