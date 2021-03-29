package com.sandbox.api.controller;

import com.sandbox.api.model.base.BaseResponse;
import com.sandbox.api.model.base.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerControllerAdvice {

    @ExceptionHandler
    private ResponseEntity<BaseResponse> genericError(Exception exception) {
        BaseResponse result = new BaseResponse();
        result.setResult(Result.of("-21", "Generic exception."));
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }
}
