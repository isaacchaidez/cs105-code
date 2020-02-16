package edu.sbcc.cs105.p3;

import java.time.LocalDate;

import edu.sbcc.cs105.IProblem;
import edu.sbcc.cs105.p3.model.AvailabilityStrategy;
import edu.sbcc.cs105.p3.model.Project;
import edu.sbcc.cs105.p3.model.Resource;
import edu.sbcc.cs105.p3.model.ResourceManager;
import edu.sbcc.cs105.p3.model.Skills;

/**
 * Problem1
 */
public class Problem3 implements IProblem {

    public void run(){

        System.out.println("Problem 3");

        ResourceManager rm = new ResourceManager();
        Resource r1 = rm.create("Alphonso",  1, 20, Skills.WebDeveloper, Skills.DatabaseDeveloper);
        Resource r2 = rm.create("Bob", 5, 25, Skills.DatabaseDeveloper, Skills.DatabaseAdministrator);
        Resource r3 = rm.create("Katarina", 5, 25, Skills.NetworkEngineer, Skills.ITArchitect);
        Resource r4 = rm.create("Jose", 1, 52, Skills.WebDeveloper, Skills.DatabaseDeveloper);
        Resource r5 = rm.create("Joe", 30, 22, Skills.WebDeveloper);
        Resource r6 = rm.create("Irena", 25, 27, Skills.ITArchitect, Skills.OperationsEngineer);
        Resource r7 = rm.create("Roberto", 20, 32, Skills.DatabaseAdministrator);
        Resource r8 = rm.create("John", 1, 52, Skills.BusinessAnalyst);
        Resource r9 = rm.create("Gina", 1, 52, Skills.BusinessAnalyst);
        Resource r10 = rm.create("Antonio", 1, 52, Skills.WebDeveloper);
        Resource r11 = rm.create("Kyle", 1, 52, Skills.DatabaseAdministrator);
        Resource r12 = rm.create("Julia", 1, 52, Skills.NetworkEngineer);
        Resource r13 = rm.create("Matt", 1, 20, Skills.ITArchitect);

        Project project1 = new Project("Customer Portal", 
            LocalDate.of(2020, 01, 01), LocalDate.of(2020, 12, 31), rm);
        
        assignResource(project1, Skills.WebDeveloper, 1, 20);
        assignResource(project1, Skills.BusinessAnalyst, 1, 20);
        assignResource(project1, Skills.WebDeveloper, 20, 32);
        assignResource(project1, Skills.WebDeveloper, 20, 32);
        assignResource(project1, Skills.DatabaseDeveloper, 1, 52);
        assignResource(project1, Skills.NetworkEngineer, 10, 15);

        Project project2 = new Project("Server Migration", 
            LocalDate.of(2020, 01, 01), LocalDate.of(2020, 12, 31), rm);
        assignResource(project2, Skills.NetworkEngineer, 1, 40);
        assignResource(project2, Skills.ITArchitect, 1, 40);
        assignResource(project2, Skills.OperationsEngineer, 1, 40);
    }

    private void assignResource(Project project, String role, int startWeek, int duration) {

        Resource res = project.addResource(role, startWeek, duration, AvailabilityStrategy.FirstAvailable);
        

        if (res != null){
            System.out.printf("%s was added as a %s to project %s in week %d for %d weeks %n", 
            res.getName(), role, project.getName(), startWeek, duration);
        } else{
            System.out.printf("No %s available for project %s starting in week %d for %d weeks %n", 
            role, project.getName(), startWeek, duration);
        }
    }
}