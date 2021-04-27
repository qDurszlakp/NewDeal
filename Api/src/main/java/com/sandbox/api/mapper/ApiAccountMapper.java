package com.sandbox.api.mapper;

import com.sandbox.api.model.Account;
import com.sandbox.domain.model.DomainAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiAccountMapper {

    Account map(DomainAccount domainAccount);

}
