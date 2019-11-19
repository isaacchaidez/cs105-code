package edu.sbcc.cs105.bankmodel;

public interface Overdraftable {
	void AddOverdraftSource(OverdraftAccount overdraftAccount);
	void RemoveOverdraftSource(String accountNumber);	
}
