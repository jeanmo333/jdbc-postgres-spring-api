package com.amigoscode.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.OK)
public class SuccessException extends RuntimeException {
    public SuccessException(String message) {
        super(message);
    }
}
