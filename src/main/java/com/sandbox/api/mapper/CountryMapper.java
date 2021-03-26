package com.sandbox.api.mapper;

import com.sandbox.api.entity.Country;
import com.sandbox.api.model.CountryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDto map(Country country);

}
