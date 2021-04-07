package com.sandbox.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Country {

    @NotNull
    private String name;

    @NotNull
    private String code;

    private LocalDateTime insertTime;

}
