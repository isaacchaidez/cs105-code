package edu.sbcc.cs105;

import java.util.ArrayList;

public class SearchResults {

	private ArrayList<Match> matches = new ArrayList<Match>();
		
	public boolean found() {

		return matches.size() > 0;
	}
	
	public int countOfMatches() {
		return matches.size();
	}
	
	public ArrayList<Match> getMatches(){
		return matches;
	}

	public void addMatch(Match m) {

		matches.add(m);
		
	}
}
