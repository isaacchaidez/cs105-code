package edu.sbcc.cs105;

/**
 * Student
 */
public class Student implements Cloneable {

    private String studentId;
    private String name;
    private DegreeProgram program;

    public Student(String studentId, String name, DegreeProgram program) {
        this.setProgram(program);
        this.setStudentId(studentId);
        this.setName(name);

    }

    public DegreeProgram getProgram() {
        return program;
    }

    public void setProgram(DegreeProgram program) {
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Object clone()throws CloneNotSupportedException{  
        return (Student)super.clone();  
       } 
}