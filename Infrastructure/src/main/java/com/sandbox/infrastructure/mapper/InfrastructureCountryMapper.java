package com.sandbox.infrastructure.mapper;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.infrastructure.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InfrastructureCountryMapper {

    DomainCountry map(Country country);

    Country map(DomainCountry domainCountry);

}
