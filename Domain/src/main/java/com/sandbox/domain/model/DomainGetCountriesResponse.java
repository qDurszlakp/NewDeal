package com.sandbox.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DomainGetCountriesResponse {

    List<DomainCountry> countries;

}
