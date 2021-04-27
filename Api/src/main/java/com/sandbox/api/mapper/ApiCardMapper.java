package com.sandbox.api.mapper;

import com.sandbox.api.model.Card;
import com.sandbox.domain.model.DomainCard;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiCardMapper {

    Card map(DomainCard domainCard);

}
