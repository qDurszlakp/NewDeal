package com.sandbox.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class DomainCountry implements Serializable {

    private String name;
    private String code;
    private LocalDateTime insertTime;

}
