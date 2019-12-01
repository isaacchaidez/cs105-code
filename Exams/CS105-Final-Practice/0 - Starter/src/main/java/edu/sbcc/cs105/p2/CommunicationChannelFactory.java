package edu.sbcc.cs105.p2;

public class CommunicationChannelFactory {

	public static CommunicationChannel create(CommunicationChannelInfo channelInfo){
		
		CommunicationChannel result = null;
		
		String channelName = "undefined";
		if (channelInfo != null){
			channelName = channelInfo.getName();
		}
			
		switch(channelName){
			case "email":
				result = new EmailCommunicationChannel();
				break;
			case "postal":
				result = new PostalCommunicationChannel();
				break;
			default:
				result = new UndefinedCommunicationChannel();
				break;
				
		}
		
		return result;
	}
}
