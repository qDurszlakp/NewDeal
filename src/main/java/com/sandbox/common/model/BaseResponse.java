package com.sandbox.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {

    private Result result;

}
