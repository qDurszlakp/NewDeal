package com.sandbox.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DomainCard implements Serializable {

    private String cardNumber;

}
