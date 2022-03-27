package org.leon.consumer.alfresco.exceptions;

public class NotCreatedContentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4070833442051224359L;
	
	public NotCreatedContentException() {
		super();
	}
	
	public NotCreatedContentException(String message) {
		super(message);
	}
	public NotCreatedContentException(String messege,Throwable cause) {
		super(messege,cause);
		
	}
	public NotCreatedContentException(Throwable cause) {
		super(cause);
	}
}
