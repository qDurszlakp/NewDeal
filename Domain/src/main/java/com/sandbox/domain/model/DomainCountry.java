package com.sandbox.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class DomainCountry {

    private String name;
    private String code;
    private LocalDateTime insertTime;

}
