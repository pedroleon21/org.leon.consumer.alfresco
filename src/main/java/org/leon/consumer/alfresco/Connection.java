package org.leon.consumer.alfresco;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.leon.consumer.alfresco.interfaces.AlfrescoConnection;


public class Connection implements AlfrescoConnection<WebTarget>{

	@SuppressWarnings("unused")
	private Configuration configuration;
	private String user;
	private String key;
	private String url;

	public void setUser(String user) {
		this.user = user;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public WebTarget factoryClient() {
		Client client = ClientBuilder.newClient();
		HttpAuthenticationFeature auth = HttpAuthenticationFeature.basic(this.user,this.key);
		client.register(auth);
		return client.target(this.url);
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public <K> void setConfiguration(K configuration) {
		this.configuration =(Configuration) configuration;
		
	}

}
