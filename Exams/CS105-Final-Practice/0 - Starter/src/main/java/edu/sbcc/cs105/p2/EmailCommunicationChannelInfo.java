package edu.sbcc.cs105.p2;

public class EmailCommunicationChannelInfo extends CommunicationChannelInfo {

	private String emailAddress;

		public EmailCommunicationChannelInfo(String emailAddress) {
		setEmailAddress(emailAddress);
		this.setName("email");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
