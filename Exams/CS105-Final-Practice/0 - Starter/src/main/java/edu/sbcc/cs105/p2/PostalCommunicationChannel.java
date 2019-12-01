package edu.sbcc.cs105.p2;

public class PostalCommunicationChannel extends CommunicationChannel {

	public void Send(Document document, CommunicationChannelInfo channelInfo){
		
		PostalCommunicationChannelInfo info = (PostalCommunicationChannelInfo)channelInfo;
		
		System.out.printf("Sending postal to %s:%s%n%s%n%s%s,%s %s%n", 
				info.recipientName, 
				document.getMessage(),
				info.addressLine1, 
				info.addressLine2 == "" ? "" : info.addressLine2 + "\n", 
				info.city, 
				info.state, 
				info.postalCode);
	}
}
