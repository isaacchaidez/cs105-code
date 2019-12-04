package edu.sbcc.cs105.p2;

public class PostalChannelConfiguration extends ChannelConfiguration {

	private final String recipientName;
	private final String addressLine1;
	private final String addressLine2;
	private final String city;
	private final String state;
	private final String postalCode;

	public PostalChannelConfiguration(final String recipientName, final String addressLine1,
			final String addressLine2, final String city, final String state, final String postalCode) {
		
		this.recipientName = recipientName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.setName("postal");
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getRecipientName() {
		return recipientName;
	}
}
