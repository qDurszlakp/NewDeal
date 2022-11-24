package com.sandbox.experimental.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Api {

    @SneakyThrows
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("OK");
    }

}
