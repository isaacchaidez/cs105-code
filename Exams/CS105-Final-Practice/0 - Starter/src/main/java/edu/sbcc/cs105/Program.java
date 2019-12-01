package edu.sbcc.cs105;

import java.util.HashMap;

import edu.sbcc.cs105.p1.Problem1;
import edu.sbcc.cs105.p2.Problem2;
import edu.sbcc.cs105.p3.Problem3;
import edu.sbcc.cs105.p4.Problem4;
import edu.sbcc.cs105.p5.Problem5;
import edu.sbcc.cs105.p6.Problem6;

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
        problemMap.put("p4", new Problem4());
        problemMap.put("p5", new Problem5());
        problemMap.put("p6", new Problem6());
    }

    
    public static void main(String[] args) {
        
        // TODO: Change the problemId string to the problem you want to run (p1 -> p6)
        String problemId = "p2";
        
        IProblem problem = problemMap.get(problemId.toLowerCase());
        problem.run();

    }
}