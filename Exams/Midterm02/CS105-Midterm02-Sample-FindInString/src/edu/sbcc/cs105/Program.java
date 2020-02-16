package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {


		String search = "The quick brown fox jumps over the lazy dog";
		String find = "The";

		SearchResults results = findInString(search, find, false);
		
		if (!results.found()) {
			System.out.println("Not found!");
			return;
		}
		
		for(Match result : results.getMatches()) {
			System.out.printf("Found at position %d, length %d%n", result.getStartPosition(), result.getLength());
		}
		
	}
	/**
	 * A naive string search implementation
	 * 
	 * @param search The string to search
	 * @param find The string to find
	 * @return SearchResults which encapsulates a list of Matches
	 */
	public static SearchResults findInString(String search, String find, boolean caseSensitive) {
		
		if (!caseSensitive) {
			search = search.toLowerCase();
			find = find.toLowerCase();
		}
		
		SearchResults results = new SearchResults();		
		int searchStringLength = search.length();
		System.out.printf("The search string '%s' is %d characters long %n", search, searchStringLength);

		boolean endOfString = false;
		int startIndex = 0;
		while(endOfString == false) {
			
			
			int foundIndex = search.indexOf(find, startIndex);
			if (foundIndex >= 0) {
				
				// Length is always the same. This is not so useful in a literal match, but would be 
				// useful using regular expressions where the match length can vary
				Match m = new Match(foundIndex, find.length());
				results.addMatch(m);
				
				// Jump start index ahead to next found position
				startIndex = foundIndex;
			}
			
			startIndex +=1;
			
			
			if (startIndex + find.length() > searchStringLength) {				
				endOfString = true;
				System.out.printf("Exiting at start index %d%n", startIndex);
			}
		}
		
		return results;
		
		
	}

}
