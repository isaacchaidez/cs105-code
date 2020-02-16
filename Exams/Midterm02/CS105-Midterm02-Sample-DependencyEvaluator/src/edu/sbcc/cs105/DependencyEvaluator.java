package edu.sbcc.cs105;

public class DependencyEvaluator {

	private Application application;

	public DependencyEvaluator(Application application) {
		this.application = application;
		
	}

	public String evaluate() {

		return application.isIs24YearsOfAge() || application.isMarried() || application.isVeteranOfArmedForces()
				|| application.hasDependents() || application.areParentsDeceased() || application.wasEmancipatedByCourt()
				|| application.wasFosterCareOrUnderLegalGuardianship() 
				? "Independent" : "Dependent";
	}
}
