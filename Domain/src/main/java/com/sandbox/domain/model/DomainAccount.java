package com.sandbox.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class DomainAccount {

    private String accountNumber;

    private List<DomainCard> cards;

}
