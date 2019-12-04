package edu.sbcc.cs105.p2;

public abstract class CommunicationChannel {

	private final ChannelConfiguration channelConfig;

	public CommunicationChannel(final ChannelConfiguration channelConfig) {
		this.channelConfig = channelConfig;
	}

	protected ChannelConfiguration getChannelConfig() {
		return channelConfig;
	}

	public abstract void Send(Document document);
}
