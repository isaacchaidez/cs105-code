package edu.sbcc.cs105;

/**
 * DegreeProgram
 */
public class DegreeProgram {

    private String majorName;
    private String majorCode;

    public DegreeProgram(String majorCode, String majorMame) {

        this.setMajorCode(majorCode);
        this.setMajorName(majorMame);
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public Object clone()throws CloneNotSupportedException{  
        return (DegreeProgram)super.clone();  
       } 
}