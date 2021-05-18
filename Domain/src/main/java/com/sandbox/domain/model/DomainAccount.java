package com.sandbox.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class DomainAccount implements Serializable {

    private String accountNumber;

    private List<DomainCard> cards;

}
