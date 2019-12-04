package edu.sbcc.cs105;

import edu.sbcc.cs105.IProblem;

/**
 * ProblemBase
 */
public abstract class ProblemBase implements IProblem {

    public void run(){

        try {
            runInternal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected abstract void runInternal() throws Exception;
    
}