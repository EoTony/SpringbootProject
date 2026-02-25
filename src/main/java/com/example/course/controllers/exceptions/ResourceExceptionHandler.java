package com.example.course.controllers.exceptions;

import com.example.course.services.exceptions.DataBaseException;
import com.example.course.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StandardError> handleException(ResourceNotFoundException ex, HttpServletRequest request) {
        String error = "Resource Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError stand = new StandardError(Instant.now(),status.value(),ex.getMessage(),error,request.getRequestURI());
        return ResponseEntity.status(status).body(stand);
    }

    @ExceptionHandler
    public ResponseEntity<StandardError> database(DataBaseException ex, HttpServletRequest request) {
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError stand = new StandardError(Instant.now(),status.value(),ex.getMessage(),error,request.getRequestURI());
        return ResponseEntity.status(status).body(stand);
    }
}
