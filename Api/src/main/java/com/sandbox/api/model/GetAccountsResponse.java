package com.sandbox.api.model;

import com.sandbox.api.model.base.BaseResponse;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class GetAccountsResponse extends BaseResponse {

    private List<Account> accounts;

}
