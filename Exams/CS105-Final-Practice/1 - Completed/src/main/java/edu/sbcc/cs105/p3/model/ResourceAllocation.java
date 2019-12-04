package edu.sbcc.cs105.p3.model;

/**
 * ResourceAllocation
 */
public class ResourceAllocation {

    private final Resource resource;
    private final int startWeek;
    private final int numberOfWeeks;
    private final Project project;

    public ResourceAllocation(final Project project, final Resource resource, 
            final int startWeek, final int numberOfWeeks) {

        this.project = project;
        this.resource = resource;
        this.startWeek = startWeek;
        this.numberOfWeeks = numberOfWeeks;

    }

    public Project getProject() {
        return project;
    }

    public int getNumberOfWeeks() {
        return numberOfWeeks;
    }

    public int getstartWeek() {
        return startWeek;
    }
    public int getEndWeek() {
		return startWeek + numberOfWeeks - 1;
	}
    
    public Resource getResource() {
        return resource;
    }

	
    
}