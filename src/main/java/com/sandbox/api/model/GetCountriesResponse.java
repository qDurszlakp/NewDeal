package com.sandbox.api.model;

import com.sandbox.common.model.BaseResponse;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class GetCountriesResponse extends BaseResponse {

    private List<CountryDto> countries;

}
