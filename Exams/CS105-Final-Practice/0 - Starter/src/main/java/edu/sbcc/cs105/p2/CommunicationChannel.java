package edu.sbcc.cs105.p2;

public abstract class CommunicationChannel {

	public abstract void Send(Document document, CommunicationChannelInfo info);
}
