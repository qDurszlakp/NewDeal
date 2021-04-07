package com.sandbox.api.controller;

import com.sandbox.api.common.CommonResultsManager;
import com.sandbox.api.model.base.BaseResponse;
import com.sandbox.api.model.base.Result;
import com.sandbox.api.model.base.ResultInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerControllerAdvice {

    @ExceptionHandler
    private ResponseEntity<BaseResponse> genericError(Exception e) {
        BaseResponse response = new BaseResponse();

        Result r = Result.of(CommonResultsManager.GENERIC_ERROR)
                         .addInfo(ResultInfo.of("Exception", "-2", e.getMessage()));

        response.setResult(r);

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
