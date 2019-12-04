package edu.sbcc.cs105.p1;

import java.io.PrintStream;


/**
 * ConsoleObserver
 */
public class ConsoleCarObserver implements CarObserver {

    private final PrintStream output;

    public ConsoleCarObserver(final PrintStream output) {
        this.output = output;
    }

    @Override
    public void notifyStopped() {
        output.println("The car has stopped");
    }

    @Override
    public void notifyVelocityChanging(final double velocity) {
        output.printf("The car is changing to new velocity %.0f%n", velocity);

    }

    @Override
    public void notifyTargetVelocityAchieved(final double velocity) {
        output.printf("The car has achieved a new target velocity of %.0f%n", velocity);
    }

    @Override
    public void notifyInitialObservedState(double velocity) {
        output.printf("The car's inital observed velocity is %.0f%n", velocity);

    }

    
}