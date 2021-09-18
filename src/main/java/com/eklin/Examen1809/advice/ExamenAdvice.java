package com.eklin.Examen1809.advice;

import com.eklin.Examen1809.exception.ClientNotExistException;
import com.eklin.Examen1809.response.ExamenResponse;
import com.eklin.Examen1809.response.ExamenStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExamenAdvice {
	@ExceptionHandler({ClientNotExistException.class})
	public ResponseEntity<ExamenResponse<?>> clientNotExistException(ClientNotExistException e){
		ExamenResponse<?> response = new ExamenResponse<>();
		response.setStatus(new ExamenStatus("5001", "El cliente no existe"));
		return ResponseEntity.internalServerError().body(response);
	}
	
	@ExceptionHandler({Exception.class})
		public ResponseEntity<ExamenResponse<?>> clientExistException(Exception e){
		ExamenResponse<?> response = new ExamenResponse<>();
		response.setStatus(new ExamenStatus("5000", "El cliente ya existe"));
		return ResponseEntity.internalServerError().body(response);
		}
}
