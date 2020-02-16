package edu.sbcc.cs105.p2;

public class UndefinedCommunicationChannel extends CommunicationChannel {

	public UndefinedCommunicationChannel(ChannelConfiguration channelConfig) {
		super(channelConfig);
	}

	@Override
	public void Send(Document document) {
		
		System.out.println("Need to update communication info for this customer");
		
	}

}
