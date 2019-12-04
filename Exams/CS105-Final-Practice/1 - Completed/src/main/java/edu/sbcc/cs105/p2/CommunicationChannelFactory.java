package edu.sbcc.cs105.p2;

public class CommunicationChannelFactory {

	public static CommunicationChannel create(ChannelConfiguration channelInfo){
		
		CommunicationChannel result = null;
		
		String channelName = "undefined";
		if (channelInfo != null){
			channelName = channelInfo.getName();
		}
			
		switch(channelName){
			case "email":
				result = new EmailCommunicationChannel(channelInfo);
				break;
			case "postal":
				result = new PostalCommunicationChannel(channelInfo);
				break;
			default:
				result = new UndefinedCommunicationChannel(channelInfo);
				break;
				
		}
		
		return result;
	}
}
