package com.wmsolucoes.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wmsolucoes.course.services.exceptions.ResourceNotFoundException;

// anotacao para interceptar as excecoes que acontecerem para que esse objeto possa executar um possivel tratamento
@ControllerAdvice
public class ResourceExceptionHandler {

	// anotation para dizer que o meu metodo resourceNotFound vai interceptar qualquer excecao do tipo ResourceNotFound e fazer o tratamento
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
