package com.data.app.springaop.aspects;

public class ForbiddenException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForbiddenException(final String message) {
        super(message);
    }
}
