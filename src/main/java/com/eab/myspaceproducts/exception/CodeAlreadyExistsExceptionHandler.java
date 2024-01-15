package com.eab.myspaceproducts.exception;

import com.eab.myspaceproducts.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class CodeAlreadyExistsExceptionHandler {
    @ExceptionHandler(CodeAlreadyExistsException.class)
    protected ResponseEntity<ErrorResponseDto> handleCodeAlreadyExistsException(RuntimeException exception, WebRequest webRequest) {
        ErrorResponseDto dto = new ErrorResponseDto(webRequest.getDescription(false), HttpStatus.BAD_REQUEST, exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }
}
