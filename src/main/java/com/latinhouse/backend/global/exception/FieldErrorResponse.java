package com.latinhouse.backend.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FieldErrorResponse {
    private final String field;
    private final String message;
}
