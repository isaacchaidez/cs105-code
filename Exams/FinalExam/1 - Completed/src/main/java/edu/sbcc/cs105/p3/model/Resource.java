package edu.sbcc.cs105.p3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Resource
 */
public class Resource {

    private String name;
    private final boolean[] allocationsByWeek;
    private final ArrayList<ResourceAllocation> allocations = new ArrayList<>();
    private final int resourceId;
    private final List<String> skills = new ArrayList<>();
    private int startWeekAvailable;
    private int weeksAvailable;

    public Resource(
        final int resourceId, 
        final String name, 
        final List<String> skills, 
        final int startWeekAvailable,
        final int weeksAvailable) {

        this.resourceId = resourceId;
        this.setStartWeekAvailable(startWeekAvailable);
        this.setWeeksAvailable(weeksAvailable);
        this.setName(name);
        this.skills.addAll(skills);
        
        allocationsByWeek = new boolean[weeksAvailable];

    }

    public int getWeeksAvailable() {
        return weeksAvailable;
    }

    public void setWeeksAvailable(int weeksAvailable) {
        this.weeksAvailable = weeksAvailable;
    }

    public int getStartWeekAvailable() {
        return startWeekAvailable;
    }

    public int getEndWeekAvailable(){
        return startWeekAvailable + weeksAvailable - 1;
    }

    public void setStartWeekAvailable(int startWeekAvailable) {
        this.startWeekAvailable = startWeekAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getResourceId() {
        return resourceId;
    }

    public List<String> getSkills(){
        return new ArrayList<>(skills);
    }

    public boolean hasSkill(String skill){
         
        for (String sk : skills) {
            if (sk.equalsIgnoreCase(skill)){
                return true;
            }
        }

        return false;
    }

    public void addSkill(String skill){
        if (!hasSkill(skill)){
            skills.add(skill);
        }
    }

    public void removeSkill(String skill){
        skills.remove(skill);        
    }

    public List<ResourceAllocation> getAllocations() {
        return new ArrayList<>(allocations);
    }

    

    public boolean isAvailable(
        final int startWeek, 
        int numberOfWeeks, 
        boolean includeAllocationCheck) {
    
        boolean result = true;

        for (int week = startWeek; week < startWeek + numberOfWeeks; week++) {
            result = result && isAvailable(startWeek, includeAllocationCheck);
            if (!result){
                break;
            }
        }

        return result;
    }

    public boolean isAvailable(
        final int weekNo, 
        boolean includeAllocationCheck) {

        int resourceAdjustedWeekIndex = getResourceAdjustedWeekIndex(weekNo);

        boolean available = weekNo >= startWeekAvailable 
            && weekNo <= getEndWeekAvailable();

        if (includeAllocationCheck){
            available = available 
            && allocationsByWeek[resourceAdjustedWeekIndex] == false;   
        }
         
        return available;        
    }

    private int getResourceAdjustedWeekIndex(int weekNo) {
        return  weekNo - startWeekAvailable;
    }
   

    public boolean allocateResource(
        final Project project, 
        final int startWeek, 
        final int numberOfWeeks) {

        boolean result = true;
        
        for (int week = startWeek; week < startWeek + numberOfWeeks; week++) {
            if (!isAvailable(week, true)) {
                result = false;
                break;
            }
        }

        if (result) {
            final ResourceAllocation alloc = new ResourceAllocation(project, this, startWeek, numberOfWeeks);
            allocations.add(alloc);

            for (int week = startWeek; week < startWeek + numberOfWeeks; week++) {
                int resourceAdjustedWeekIndex = getResourceAdjustedWeekIndex(week);
                allocationsByWeek[resourceAdjustedWeekIndex] = true;
            }
        }

        return result;
    }

    public List<Project> getAssignedProjects(final int startWeek, final int numberOfWeeks) {

        final HashSet<Project> assignedProjects = new HashSet<Project>();

        for (int week = startWeek; week < startWeek + numberOfWeeks; week++) {
            final List<ResourceAllocation> allocsThisWeek = getAllocations(week);
            for (final ResourceAllocation resourceAllocation : allocsThisWeek) {
                if (!assignedProjects.contains(resourceAllocation.getProject())) {
                    assignedProjects.add(resourceAllocation.getProject());
                }
            }
        }

        final Project[] projectsAssignedArray = (Project[]) assignedProjects.toArray();

        return Arrays.asList(projectsAssignedArray);

    }

    public List<ResourceAllocation> getAllocations(final int week) {

        final ArrayList<ResourceAllocation> result = new ArrayList<>();

        for (final ResourceAllocation resourceAllocation : allocations) {
            if (week >= resourceAllocation.getstartWeek() && 
                week <= resourceAllocation.getEndWeek()){
                    result.add(resourceAllocation);
                }
        }

        return result;
    }

	public boolean isAssignedToProject(Project project, int startWeek, int numberOfWeeks) {
		return false;
	}
}