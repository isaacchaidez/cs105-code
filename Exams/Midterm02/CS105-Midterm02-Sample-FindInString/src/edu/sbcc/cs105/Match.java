package edu.sbcc.cs105;

public class Match {

	private int startPosition;
	private int length;
	
	public Match(int startPosition, int length) {
		this.setStartPosition(startPosition);
		this.setLength(length);
	}

	public int getStartPosition() {
		return startPosition;
	}

	private void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getLength() {
		return length;
	}

	private void setLength(int length) {
		this.length = length;
	}
	
	
}
