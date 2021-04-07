package com.sandbox.api.common;

import com.sandbox.api.model.base.Result;

public class CommonResultsManager {

    public static final Result SUCCESS = of(Result.SUCCESS_CODE, "OK");
    public static final Result GENERIC_ERROR = of("-1", "Generic error.");
    public static final Result DB_ERROR = of("-2", "DB error.");

    private CommonResultsManager() {
    }

    private static Result of(String code, String description) {
        return Result.of(code, description);
    }

}
