package org.leon.consumer.alfresco.exceptions;

public class EmptyContentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2600640861868474174L;
	
	public EmptyContentException() {
		super();
	}
	
	public EmptyContentException(Throwable cause) {
		super(cause);
	}

	public EmptyContentException(String messege,Throwable cause) {
		super(messege,cause);
	}
	
	public EmptyContentException(String messege) {
		super(messege);
	}
}
