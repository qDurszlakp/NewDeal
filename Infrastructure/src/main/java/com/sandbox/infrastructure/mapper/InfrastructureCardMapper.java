package com.sandbox.infrastructure.mapper;

import com.sandbox.domain.model.DomainCard;
import com.sandbox.infrastructure.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InfrastructureCardMapper {

    DomainCard map(Card card);

}
