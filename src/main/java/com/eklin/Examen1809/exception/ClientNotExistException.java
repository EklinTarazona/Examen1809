package com.eklin.Examen1809.exception;

public class ClientNotExistException extends Exception{
	public ClientNotExistException() {
		super();
	}
	
	public ClientNotExistException(String message) {
		super(message);
	}
	
	public ClientNotExistException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ClientNotExistException(Throwable cause) {
		super(cause);
	}
}
