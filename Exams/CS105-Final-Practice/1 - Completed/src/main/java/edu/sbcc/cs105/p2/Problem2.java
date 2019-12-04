package edu.sbcc.cs105.p2;

import java.util.ArrayList;

import edu.sbcc.cs105.ProblemBase;

public class Problem2 extends ProblemBase {

	@Override
	public void runInternal() throws Exception {

		ArrayList<Account> accounts = new ArrayList<Account>();
		
		Account acct;
		
		acct = new Account("123456", "Joe Smith", 100);
		ChannelConfiguration pref = new EmailChannelConfiguration("joe.smith@gmail.com");
		acct.setDocumentCommunicationPreference(pref);
		accounts.add(acct);
		
		acct = new Account("223456", "Jane Gaucho", 200);
		 pref = new PostalChannelConfiguration(
				 	"Jane Gaucho", "123 State Streeet", "", "Santa Barbara", "CA", "93105");
		acct.setDocumentCommunicationPreference(pref);
		accounts.add(acct);
		
		
		acct = new Account("345678", "Juan Gaucho", 200);
		accounts.add(acct);
		
		CommunicationManager m = new CommunicationManager();
		for(Account a : accounts){
			m.Send(a.prepareStatement(), a.getDocumentCommunicationPreference());
			System.out.println();
		}
	}

}
