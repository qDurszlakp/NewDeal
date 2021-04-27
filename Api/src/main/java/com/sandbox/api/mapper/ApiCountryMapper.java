package com.sandbox.api.mapper;

import com.sandbox.api.model.Country;
import com.sandbox.domain.model.DomainCountry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiCountryMapper {

    Country map(DomainCountry domainCountry);

    DomainCountry map(Country country);
}
