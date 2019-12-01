package edu.sbcc.cs105.p2;

public class PostalCommunicationChannelInfo extends CommunicationChannelInfo {

	public String recipientName;
	public String addressLine1;
	public String addressLine2;
	public String city;
	public String state;
	public String postalCode;
	
	public PostalCommunicationChannelInfo(
			String recipientName, 
			String addressLine1, 
			String addressLine2, 
			String city, 
			String state, 
			String postalCode){
		
		this.recipientName = recipientName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.setName("postal");
	}
}
