package com.easj.exception;

public class UsuarioException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public UsuarioException(String mensaje) {
        super(mensaje);
    }
}
