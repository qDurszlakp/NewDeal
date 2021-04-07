package com.sandbox.infrastructure.mapper;

import com.sandbox.domain.model.DomainCountry;
import com.sandbox.infrastructure.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InfrastructureCountryMapper {

    List<DomainCountry> map(List<Country> country);

    Country map(DomainCountry domainCountry);
}
