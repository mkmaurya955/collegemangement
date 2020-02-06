package com.example.collegemangement.base;

/**
 * 
 * @author pbattula
 *
 */

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 4561314432556743000L;

	public BadRequestException(String message) {
		super(message);
	}

}
