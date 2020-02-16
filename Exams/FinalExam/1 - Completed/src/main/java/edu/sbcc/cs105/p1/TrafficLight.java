package edu.sbcc.cs105.p1;

import java.util.ArrayList;

public class TrafficLight {

	private TrafficLightState state;
	private ArrayList<TrafficLightObserver> observers = new ArrayList<>();
	
	public TrafficLight(TrafficLightState initialState) {
		setState(initialState);
	}

	public void setState(TrafficLightState state){
		
		this.state = state;
		
		// Let every observer know that the light has changed
		for(TrafficLightObserver observer : observers){
			observer.notifyStateChange(state);
		}
	}
	
	public TrafficLightState getState(){		
		return state;			
	}

	public void addObserver(TrafficLightObserver observer) {

		observers.add(observer);
		
	}
}
