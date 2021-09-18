package com.eklin.Examen1809.exception;

public class ClientExistException extends Exception{
	public ClientExistException() {
		super();
	}

	public ClientExistException(String message) {
		super(message);
	}

	public ClientExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClientExistException(Throwable cause) {
		super(cause);
	}
}
