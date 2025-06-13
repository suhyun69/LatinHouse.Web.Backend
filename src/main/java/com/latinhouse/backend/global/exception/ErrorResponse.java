package com.latinhouse.backend.global.exception;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ErrorResponse {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private final int status;
    private final String error;
    private final String message;
    private final List<FieldErrorResponse> fieldErrors;

    // 일반 오류용
    public ErrorResponse(ErrorCode code) {
        this.status = code.getStatus().value();
        this.error = code.getStatus().name();
        this.message = code.getMessage();
        this.fieldErrors = null;
    }

    // 필드 오류용
    public ErrorResponse(ErrorCode code, List<FieldErrorResponse> fieldErrors) {
        this.status = code.getStatus().value();
        this.error = code.getStatus().name();
        this.message = code.getMessage();
        this.fieldErrors = fieldErrors;
    }
}
