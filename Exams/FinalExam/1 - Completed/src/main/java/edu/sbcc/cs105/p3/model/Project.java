package edu.sbcc.cs105.p3.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Project
 */
public class Project {

    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int durationInWeeks;
    private final String name;
    private final ArrayList<Resource> resources = new ArrayList<>();
    private ResourceManager resourceManager;

    public Project(final String name, final LocalDate startDate, final LocalDate endDate,
            final ResourceManager resourceManager) {

        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resourceManager = resourceManager;
        durationInWeeks = (int) ChronoUnit.WEEKS.between(startDate, endDate);

    }

    public List<Resource> getResources() {
        return new ArrayList<Resource>(resources);
    }

    

    public Resource addResource(
            String skill, 
            int startWeek, 
            int numberOfWeeks, 
            AvailabilityStrategy availabilityStrategy){

       
        Resource result = null;
        while (result == null){
            
            Resource possible = resourceManager
                .getAvailableResource(skill, startWeek, numberOfWeeks, availabilityStrategy);

            if (possible == null){
                break;
            }

            if (!possible.isAssignedToProject(this, startWeek, numberOfWeeks)){
                possible.allocateResource(this, startWeek, numberOfWeeks);
                result = possible;             
            }

        }

        return result;

    }
    public void addResource(Resource resource){
        
        boolean assigned = false;
        for (Resource assignedResource : resources) {
            if (resource == assignedResource ){
                assigned = true;
                break;
            }
        }

        if (!assigned){
            resources.add(resource);
        }
    }



    public String getName() {
        return name;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}