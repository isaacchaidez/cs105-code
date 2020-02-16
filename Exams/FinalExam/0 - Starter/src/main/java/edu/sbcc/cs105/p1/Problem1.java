package edu.sbcc.cs105.p1;


import edu.sbcc.cs105.ProblemBase;

public class Problem1 extends ProblemBase {

	@Override
	public void runInternal() throws Exception {
	
		
		final TrafficLightState initialState = TrafficLightState.Green;

		final Car myCar = new Car();

		// Tell traffic light to observe this car. This seems odd, but allows our traffic light to inform the car when it changes. 
		// There are more advanced ways of doing this with java events, but we are keeping it simple right now
		final TrafficLight trafficLight = new TrafficLight(initialState);
		trafficLight.addObserver(myCar);

		// Let the console observe car events
		final CarObserver consoleObserver = new ConsoleCarObserver(System.out);
		myCar.addCarObserver(consoleObserver);

		// Write car events to file when they occur 
		FileCarObserver fileObserver = new FileCarObserver("d:\\temp\\car-events.csv");
		myCar.addCarObserver(fileObserver);


		// Simulate car activity
		final double velocity = 25;
		myCar.accelerate(velocity, true);		
		
		trafficLight.setState(TrafficLightState.Yellow);
		trafficLight.setState(TrafficLightState.Red);			
		trafficLight.setState(TrafficLightState.Green);
		
		myCar.stop();

		fileObserver.close();
		
		
		
	}

	

}
