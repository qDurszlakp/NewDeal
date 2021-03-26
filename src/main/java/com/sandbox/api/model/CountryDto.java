package com.sandbox.api.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CountryDto {

    private String name;
    private String code;
    private LocalDateTime insertTime;

}
