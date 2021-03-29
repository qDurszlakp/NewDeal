package com.sandbox.api.mapper;

import com.sandbox.api.model.GetCountriesResponse;
import com.sandbox.domain.model.DomainGetCountriesResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiCountryMapper {

    GetCountriesResponse map(DomainGetCountriesResponse countries);

}
