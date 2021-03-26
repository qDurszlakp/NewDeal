package com.sandbox.common.model;

import lombok.Value;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Value(staticConstructor = "of")
public class Result implements Serializable {

    public static final String SUCCESS_CODE = "0";

    String code;
    String description;
    List<ResultInfo> infos;

    public static Result of(String code, String description) {
        return of(code, description, null);
    }

    public Result code(String code) {
        return of(code, this.description, this.infos);
    }

    public Result description(String description) {
        return of(this.code, description, this.infos);
    }

    public Result addInfo(ResultInfo info) {

        if (this.infos != null) {
            List<ResultInfo> enrichedInfos = new ArrayList<>(this.infos);
            enrichedInfos.add(info);
            return of(this.code, this.description, enrichedInfos);
        }

        return of(this.code, this.description, Collections.singletonList(ResultInfo.of(info.getSource(), info.getCode(), info.getDescription())));
    }

    public Result addInfo(String source, String code, String description) {
        return addInfo(ResultInfo.of(source, code, description));
    }

}
