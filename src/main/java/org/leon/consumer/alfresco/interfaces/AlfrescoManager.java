package org.leon.consumer.alfresco.interfaces;

import org.leon.consumer.alfresco.exceptions.MessegeException;
import org.leon.consumer.alfresco.form.Content;

public interface AlfrescoManager <T>{
	
	
	public <C> void BuildClient(C configuration);
	
	/*
	 * implement this interface by creating your on transaction of type you need
	 * */
	public T getTransaction();  
	
	/*
	 * to use this method, create a class to transfer data and extends the type of contend
	 * */
	public void send(Content content) throws MessegeException;
	
	public void endTransaction(boolean validTransaction);

}
