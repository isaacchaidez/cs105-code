package edu.sbcc.cs105.p2;

public class EmailCommunicationChannel extends CommunicationChannel {

	public EmailCommunicationChannel(ChannelConfiguration config) {
		super(config);
	}
	
	@Override
	public void Send(Document document) {

		EmailChannelConfiguration email 
		= (EmailChannelConfiguration)getChannelConfig();
		
		System.out.printf("Sending email to %s: %s%n", email.getEmailAddress(), document.getMessage());
		
	}

}
