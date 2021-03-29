package com.sandbox.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Country {

    private String name;
    private String code;
    private LocalDateTime insertTime;

}
