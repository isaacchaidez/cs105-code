package edu.sbcc.cs105.p1;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * FileCarObserver
 */
public class FileCarObserver implements CarObserver, Closeable {

    PrintWriter output;

    public FileCarObserver(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        output = new PrintWriter(file);       
    }

    @Override
    public void close() throws IOException {
        output.close();

    }

    @Override
    public void notifyStopped() {
        writeEvent("Stopped", 0);

    }

    @Override
    public void notifyVelocityChanging(double velocity) {
        writeEvent("Velocity Changing", velocity);

    }

    @Override
    public void notifyTargetVelocityAchieved(double velocity) {
        writeEvent("Velocity Achieved", velocity);

    }

    @Override
    public void notifyInitialObservedState(double velocity) {
        writeEvent("Initial observed velocity", velocity);
    }

    private void writeEvent(String eventName, double velocity){

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        final String current = formatter.format(LocalDateTime.now());
        
        String data = String.format("%s,%s,%s%n", eventName, velocity, current);

        output.write(data);

    }

   
    
}