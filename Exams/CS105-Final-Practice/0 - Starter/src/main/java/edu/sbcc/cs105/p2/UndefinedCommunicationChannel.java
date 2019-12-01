package edu.sbcc.cs105.p2;

public class UndefinedCommunicationChannel extends CommunicationChannel {

	@Override
	public void Send(Document document, CommunicationChannelInfo info) {
		
		System.out.println("Need to update communication info for this customer");
		
	}

}
