package edu.sbcc.cs105.p2;

public class PostalCommunicationChannel extends CommunicationChannel {

	public PostalCommunicationChannel(ChannelConfiguration channelConfig) {
		super(channelConfig);
	}

	public void Send(Document document) {
		
		PostalChannelConfiguration info = 
			(PostalChannelConfiguration)getChannelConfig();
		
		System.out.printf("Sending postal to %s:%s%n%s%n%s%s,%s %s%n", 
				info.getRecipientName(), 
				document.getMessage(),
				info.getAddressLine1(), 
				info.getAddressLine2() == "" ? "" : info.getAddressLine2() + "\n", 
				info.getCity(), 
				info.getState(), 
				info.getPostalCode());
	}
}
