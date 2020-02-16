package edu.sbcc.cs105.p1;

import java.util.ArrayList;

public class Car implements TrafficLightObserver {

	
	private double velocity;
	private double lastVelocity;
	private ArrayList<CarObserver> carObservers = new ArrayList<>();
	
	public void accelerate(double toVelocity, boolean saveLastVelocity){
		
		
		notifyObservers(CarMotionState.ChangingVelocity, toVelocity);

		velocity = toVelocity;
		
		if (saveLastVelocity){
			lastVelocity = velocity;
		}

		
		notifyObservers(CarMotionState.InMotion, velocity);
		
	}
	
	public void stop(){
		
		notifyObservers(CarMotionState.TransitioningToStopped, 0);

		velocity = 0;

		notifyObservers(CarMotionState.Stopped, velocity);
	}

	public double getVelocity(){
		return velocity;
	}
	
	@Override
	public void notifyStateChange(TrafficLightState newState) {
		
		if(newState == TrafficLightState.Green && velocity == 0){
			//notifyObservers(CarMotionState.TransitioningToInMotion, _lastVelocity);
			accelerate(lastVelocity, true);				
		} else if (newState == TrafficLightState.Red && velocity > 0){
			
			stop();
		} else if (newState == TrafficLightState.Yellow && velocity > 0){
			accelerate(lastVelocity + 15, false);
		}
		
	}

	private void notifyObservers(CarMotionState state, double newVelocity) {


		for (CarObserver carObserver : carObservers) {
			switch (state) {
				case InMotion:
					carObserver.notifyTargetVelocityAchieved(newVelocity);
					break;

				case ChangingVelocity:
					carObserver.notifyVelocityChanging(newVelocity);
					break;
			
	
				case TransitioningToInMotion:
					carObserver.notifyVelocityChanging(newVelocity);
					break;
		
				case TransitioningToStopped:
					carObserver.notifyVelocityChanging(newVelocity);
					break;
	
			
				default:
					carObserver.notifyStopped();
					break;
			}
		}
		
		
	}

	public void addCarObserver(CarObserver observer) {
		carObservers.add(observer);
		observer.notifyInitialObservedState(velocity);
	}
}
