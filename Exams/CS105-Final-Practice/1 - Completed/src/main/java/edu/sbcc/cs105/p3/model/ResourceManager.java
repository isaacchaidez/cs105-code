package edu.sbcc.cs105.p3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ResourceManager
 */
public class ResourceManager {

    private final ArrayList<Resource> resourcePool = new ArrayList<>();
    private static int nextResourceId = 1;

    public Resource create(String name, int startWeekAvailable,  int weeksAvailable, String... skills){

       
        Resource res = new Resource(nextResourceId, name,  
            Arrays.asList(skills), startWeekAvailable, weeksAvailable);
        resourcePool.add(res);
        nextResourceId++;

        return res;

    }

    public List<Resource> getResourcesWithSkill(String skill){

        ArrayList<Resource> result = new ArrayList<>();

        for (Resource resource : resourcePool) {
            if (resource.hasSkill(skill)){
                result.add(resource);
            }        
        }

        return result;
    }

    public Resource getAvailableResource(String skill, int startWeek, int numberOfWeeks, AvailabilityStrategy availabilityStrategy){

        Resource result = null;
       
        List<Resource> possible = getResourcesWithSkill(skill);
        ArrayList<Resource> pool = new ArrayList<>();
        for (Resource resource : possible) {

            if (!resource.hasSkill(skill)){
                continue;
            }
            
            boolean isAvailable = resource.isAvailable(startWeek, numberOfWeeks, true);
            if (!isAvailable){
                continue;
            }

            if (availabilityStrategy == AvailabilityStrategy.FirstAvailable){
                result = resource;
                break;
            } else{
                pool.add(resource);
            }

        }

        if (availabilityStrategy == AvailabilityStrategy.Random){
            result = pool.get((int)Math.random() * pool.size());            
        }

        return result;
        
    }
}