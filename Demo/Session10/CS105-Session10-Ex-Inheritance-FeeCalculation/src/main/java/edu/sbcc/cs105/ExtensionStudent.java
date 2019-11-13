package edu.sbcc.cs105;

/**
 * ExtensionStudent
 */
public class ExtensionStudent extends Student{

    private boolean wasUndergraduate;

    public ExtensionStudent(String studentId, boolean wasUndergraduate) {
                   
        super(studentId);
        
        this.wasUndergraduate = wasUndergraduate;	
		
    }
    
    @Override
	public FeeCalculationMethod getFeeCalculationMethod() {

        double discount = 0;
		if (wasUndergraduate){
            discount = .1;
        }

		return super.getFeeCalculationMethod(discount);
	}
}