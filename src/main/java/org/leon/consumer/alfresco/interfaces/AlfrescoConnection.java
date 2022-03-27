package org.leon.consumer.alfresco.interfaces;

public interface AlfrescoConnection <T>{
	
	public <K> void setConfiguration(K configuration);
	
	public void setUser(String user);
	
	public void setKey(String key);
	
	public void setUrl(String url);
	
	public T factoryClient();
}
