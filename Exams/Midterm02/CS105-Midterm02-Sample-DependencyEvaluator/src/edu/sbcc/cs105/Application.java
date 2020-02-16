package edu.sbcc.cs105;

public class Application {

	private boolean is24YearsOfAge;
	private boolean isVeteranOfArmedForces;
	private boolean isMarried;
	private boolean hasDependents;
	private boolean areParentsDeceased;
	private boolean wasEmancipatedByCourt;
	private boolean wasFosterCareOrUnderLegalGuardianship;
	private String applicantName;
	
	public Application(String applicantName) {
			
		this.applicantName = applicantName;
	}
	public boolean isIs24YearsOfAge() {
		return is24YearsOfAge;
	}
	public void setIs24YearsOfAge(boolean is24YearsOfAge) {
		this.is24YearsOfAge = is24YearsOfAge;
	}
	public boolean isVeteranOfArmedForces() {
		return isVeteranOfArmedForces;
	}
	public void setVeteranOfArmedForces(boolean isVeteranOfArmedForces) {
		this.isVeteranOfArmedForces = isVeteranOfArmedForces;
	}
	public boolean hasDependents() {
		return hasDependents;
	}
	public void hasDependents(boolean hasDependents) {
		this.hasDependents = hasDependents;
	}
	public boolean areParentsDeceased() {
		return areParentsDeceased;
	}
	public void areParentsDeceased(boolean areParentsDeceased) {
		this.areParentsDeceased = areParentsDeceased;
	}
	public boolean wasEmancipatedByCourt() {
		return wasEmancipatedByCourt;
	}
	public void wasEmancipatedByCourt(boolean wasEmancipatedByCourt) {
		this.wasEmancipatedByCourt = wasEmancipatedByCourt;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public boolean wasFosterCareOrUnderLegalGuardianship() {
		return wasFosterCareOrUnderLegalGuardianship;
	}
	public void wasFosterCareOrUnderLegalGuardianship(boolean wasFosterCareOrUnderLegalGuardianship) {
		this.wasFosterCareOrUnderLegalGuardianship = wasFosterCareOrUnderLegalGuardianship;
	}
	public String getApplicantName() {
		return applicantName;
	}
	
}
