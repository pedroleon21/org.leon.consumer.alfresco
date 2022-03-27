package org.leon.consumer.alfresco.interfaces;

import org.leon.consumer.alfresco.form.Content;

public interface Transaction <T>{
	
	public void setupConnection(String unit);
	
	public void prepare(Content content);
	
	public void incorporate() throws Exception;
	
	public void disincorporate();
	
}
