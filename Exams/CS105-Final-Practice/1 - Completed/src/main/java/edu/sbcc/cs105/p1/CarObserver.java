package edu.sbcc.cs105.p1;

/**
 * CarObserver
 */
public interface CarObserver {

    void notifyInitialObservedState(double velocity);
    void notifyStopped();
    void notifyVelocityChanging(double velocity);
	void notifyTargetVelocityAchieved(double velocity);
	
}