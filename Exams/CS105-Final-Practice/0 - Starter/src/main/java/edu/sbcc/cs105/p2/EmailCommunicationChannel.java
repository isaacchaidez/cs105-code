package edu.sbcc.cs105.p2;

public class EmailCommunicationChannel extends CommunicationChannel {

	@Override
	public void Send(Document document, CommunicationChannelInfo info) {

		EmailCommunicationChannelInfo email = (EmailCommunicationChannelInfo)info;
		
		System.out.printf("Sending email to %s: %s%n", email.getEmailAddress(), document.getMessage());
		
	}

}
