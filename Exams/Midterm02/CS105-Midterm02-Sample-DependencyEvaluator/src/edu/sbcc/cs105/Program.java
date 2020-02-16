package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We are accepting the default values for app1 which is false for everything
		Application app = new Application("Joe Gaucho");
		DependencyEvaluator evaluator = new DependencyEvaluator(app);
		System.out.printf("%s is a(n) %s student%n%n", app.getApplicantName(), evaluator.evaluate());
		
		app = new Application("Jane Gaucho");
		app.setVeteranOfArmedForces(true);
		evaluator = new DependencyEvaluator(app);
		System.out.printf("%s is a(n) %s student", app.getApplicantName(), evaluator.evaluate());
		
		
	}

}
