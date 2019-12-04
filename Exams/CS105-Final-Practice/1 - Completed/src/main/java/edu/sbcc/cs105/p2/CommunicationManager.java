package edu.sbcc.cs105.p2;

public class CommunicationManager {

	public void Send(Document document, ChannelConfiguration communicationChannelInfo){
		
		CommunicationChannel channel 
			= CommunicationChannelFactory.create(communicationChannelInfo);
		channel.Send(document);
	}
}
