package org.leon.consumer.alfresco;

import java.util.Objects;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.leon.consumer.alfresco.exceptions.EmptyContentException;
import org.leon.consumer.alfresco.exceptions.NotCreatedContentException;
import org.leon.consumer.alfresco.form.AlfrescoContent;
import org.leon.consumer.alfresco.form.Content;

public class AlfrescoActuator {
	
	private Content content;
	
	private Content posted;
	
	private Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	protected void configureConnection() {
		if(Objects.isNull(this.connection)) {
			//TODO:setup a file to get connection configurations
			this.connection = new Connection();
//			this.connection.setKey();
		}
	}
	

	protected void reverse() {
//		TODO: create method to reverser post;
	}


	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Content getPosted() {
		return posted;
	}

	public void setPosted(Content posted) {
		this.posted = posted;
	}

	protected AlfrescoContent post()  {
		if(Objects.isNull(this.getContent()))
			throw new EmptyContentException("cannot send empty content");
		WebTarget target = this.getConnection().factoryClient();
		Response response = target.request().post(Entity.json(this.content));
		if(response.getStatus() != Status.CREATED.getStatusCode()) {
			throw new NotCreatedContentException();
		}
		return response.readEntity(AlfrescoContent.class);
	}
}
