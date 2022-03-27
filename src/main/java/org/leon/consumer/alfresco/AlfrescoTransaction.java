package org.leon.consumer.alfresco;

import org.leon.consumer.alfresco.form.AlfrescoContent;
import org.leon.consumer.alfresco.form.Content;
import org.leon.consumer.alfresco.interfaces.Transaction;

public class AlfrescoTransaction extends AlfrescoActuator  implements Transaction<AlfrescoContent> {
	
	public void prepare(Content content) {
		this.setContent(content);
		this.configureConnection();
	}


	public void incorporate() {
		 this.post();
	}

	public void disincorporate() {
		this.reverse();
	}

	public void setupConnection(String unit) {
//		TODO:Factory connection
//		this.setConnection((Connection) connecetion);
	}
}
