package com.sandbox.common.model;

import lombok.Value;

import java.io.Serializable;

@Value(staticConstructor = "of")
public class ResultInfo implements Serializable {

    String source;
    String code;
    String description;

    public ResultInfo source(String source) {
        return of(source, this.code, this.description);
    }

    public ResultInfo code(String code) {
        return of(this.source, code, this.description);
    }

    public ResultInfo description(String description) {
        return of(this.source, this.code, description);
    }

}
