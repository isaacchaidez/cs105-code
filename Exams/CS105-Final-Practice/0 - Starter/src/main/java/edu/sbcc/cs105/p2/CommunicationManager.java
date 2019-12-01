package edu.sbcc.cs105.p2;

public class CommunicationManager {

	public void Send(Document document, CommunicationChannelInfo communicationChannelInfo){
		
		CommunicationChannel channel = CommunicationChannelFactory.create(communicationChannelInfo);
		channel.Send(document, communicationChannelInfo);
	}
}
