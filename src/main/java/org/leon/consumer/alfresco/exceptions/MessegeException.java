package org.leon.consumer.alfresco.exceptions;

public class MessegeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6086640734240630258L;
	public MessegeException(String messege) {
		super(messege);
	}
	public MessegeException(String messege, Throwable cause) {
		super(messege,cause);
	}
	public MessegeException(Exception e) {
		super(e);
	}
}
