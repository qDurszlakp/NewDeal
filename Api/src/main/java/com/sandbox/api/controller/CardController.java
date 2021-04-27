package com.sandbox.api.controller;

import com.sandbox.api.model.GetCardsResponse;
import com.sandbox.api.service.ApiCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final ApiCardService cardService;

    @GetMapping("/getCards")
    public ResponseEntity<GetCardsResponse> getCards() {
        GetCardsResponse apiResponse = cardService.getCards();
        return ResponseEntity.ok(apiResponse);
    }

}
