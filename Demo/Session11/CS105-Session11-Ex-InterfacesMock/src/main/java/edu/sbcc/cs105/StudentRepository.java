package edu.sbcc.cs105;

public interface StudentRepository {

	Student getStudent(int id);
	void saveStudent(Student student);
	
}
