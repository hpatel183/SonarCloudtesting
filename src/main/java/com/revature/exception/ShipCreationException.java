package com.revature.exception;

@SuppressWarnings("serial")
public class ShipCreationException extends Exception {

	public ShipCreationException() {
		super();
	}

	public ShipCreationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ShipCreationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShipCreationException(String message) {
		super(message);
	}

	public ShipCreationException(Throwable cause) {
		super(cause);
	}

}
