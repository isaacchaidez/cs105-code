# Problem1 - Traffic Light System

## Problem Description

You will create an object-oriented system that simulates car and traffic lights with event monitoring for both (e.g. Car changes velocity, Traffic light changes)

**Problem Context**

This system is a simulator for various observable events that might happen in a traffic system. We implement a design pattern here called the Observer Pattern wherein an object can subscribe to events that may occur in another object.  As an example, a car can subscribe to traffic light events or we can have an out



## <img src="images/TrafficSystem.png"  />

**Explanation of  Classes and Relationships**

- TrafficLightObserver interface - Any class (e.g. a Car) that implements this interface will be notified when the TrafficLightChanges and can respond (e.g. stopping, slowing down, or continuing)
- TrafficLight - Simulates a traffic light. Allows cars, for example, to subscribe (addObserver) to traffic light changes and notifies them upon a change the traffic light state
- Car - Simulates a car. Implements TrafficLightObserver and can receive events from multiple traffic lights (although more than one at a time is probably not practical). 
- CarObserver interface - Any class that implements this interface will be notified of specific events (initial velocity, velocity changing, velocity achieved, velocity reached).
- FileCarObserver - A CarObserver that writes to a file whenever it receives car events
- ConsoleCarObserver - A CarObserver that writes car events to a console. 



## Instructions

- In the **edu.sbcc.cs105.p1** folder, create your Java class files
- Put any client code in Problem1.java **run** method. Client code means code that runs / tests your solution. 
- When ready to run, change the problemId in Program.main to "p1"
- Convert the UML class above to code. Names of the class, method, and parameters must all be correctly spelled including the case of the letters (upper / lower)
- Implement the classes and methods as specified below

### Classes and Methods

- Car

  - getVelocity() returns the current velocity
  - stop() - changes the velocity to zero. Notify car observers before and after velocity change
  - accelerate(...)
    -  Changes the velocity of the car in a positive or negative direction. Calling it with a negative value when you want to slow the car down. 
      - toVelocity - the new velocity
      - saveLastVelocity - caches the last velocity, so you can resume it later (used with stop)
    - Notify all  car observers before and after velocity change
  - notifyStateChange - realized from TrafficLightObserver. Based upon the traffic light state change and the car's current state (stopped, in motion), makes the appropriate change in velocity (e.g. if velocity > 0, then a red light signal will initiate a stop)
  - addCarObserver - Adds an object to its list of observers that realizes the CarObserver interface
  - notifyObservers - Extraction of notification logic  since car observers will need to be notified from different points in the code. 

- TrafficLight

  - Constructor - Initializes traffic light with starting state (green, yellow, red)
  - setState - changes the state of the traffic light. Notifies any observers of the change
  
- getState - returns current state
  
  - addObserver - Adds an object that realizes TrafficLightObserver interface to its list of observers
  
- TrafficLightObserver - Provides a notify method to inform objects that realize this interface of changes to a given traffic light's state

- CarObserver Interface

  - Provides a set of methods that are called by an observed car when its state changes (initial, stopped, changing, achieved)

- FileCarObserver - Writes car events to a file specified in the constructor

- ConsoleCarObserver- Writes car events to a print stream. The ConsoleCarObserver should be initialized with System.out as a constructor argument, but should not call System.out directly

  

## Testing Your Code

Sample code is provided for you in the Problem1.java class




