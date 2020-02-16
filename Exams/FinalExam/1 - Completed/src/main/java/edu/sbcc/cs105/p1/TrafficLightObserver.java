package edu.sbcc.cs105.p1;

public interface TrafficLightObserver {
	void notifyStateChange(TrafficLightState newState);
}
