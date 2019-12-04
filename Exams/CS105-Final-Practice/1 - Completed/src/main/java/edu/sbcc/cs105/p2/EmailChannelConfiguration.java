package edu.sbcc.cs105.p2;

public class EmailChannelConfiguration extends ChannelConfiguration {

	private String emailAddress;

		public EmailChannelConfiguration(String emailAddress) {
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
