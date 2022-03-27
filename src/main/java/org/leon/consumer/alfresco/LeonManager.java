package org.leon.consumer.alfresco;

import org.leon.consumer.alfresco.exceptions.MessegeException;
import org.leon.consumer.alfresco.form.Content;
import org.leon.consumer.alfresco.interfaces.AlfrescoManager;

public class LeonManager implements AlfrescoManager<AlfrescoTransaction>{
	
	private AlfrescoTransaction transaction;	

	public AlfrescoTransaction getTransaction() {
		return this.transaction;
	}

	public void send(Content content) throws MessegeException {
		try {
			transaction.prepare(content);
			transaction.incorporate();			
		}catch(Exception e) {
			throw new MessegeException(e);
		}
	}
	
	public void endTransaction(boolean validTransaction) {
		if(!validTransaction)
			this.transaction.disincorporate();
	}

	public <C> void BuildClient(C configuration) {
		// TODO Auto-generated method stub
		
	}
}
