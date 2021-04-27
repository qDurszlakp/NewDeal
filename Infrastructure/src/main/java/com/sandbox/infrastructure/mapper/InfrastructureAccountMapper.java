package com.sandbox.infrastructure.mapper;

import com.sandbox.domain.model.DomainAccount;
import com.sandbox.infrastructure.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InfrastructureAccountMapper {

    DomainAccount map(Account account);

}
