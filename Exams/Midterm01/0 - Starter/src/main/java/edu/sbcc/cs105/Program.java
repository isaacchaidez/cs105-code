package edu.sbcc.cs105;

import java.util.HashMap;

import edu.sbcc.cs105.p1.Problem1;
import edu.sbcc.cs105.p2.Problem2;
import edu.sbcc.cs105.p3.Problem3;


/**
 * Program
 */
public class Program {

    private static HashMap<String,IProblem> problemMap
        = new HashMap<>();

    static {
        problemMap.put("p1", new Problem1());
        problemMap.put("p2", new Problem2());
        problemMap.put("p3", new Problem3());
       
    }

    
    public static void main(String[] args) {
        
        // TODO: Change the problemId string to the problem you want to run (p1 -> p6)
        String problemId = "p1";
        
        IProblem problem = problemMap.get(problemId.toLowerCase());
        problem.run();

    }
}