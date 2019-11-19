package edu.sbcc.cs105;

import java.util.ArrayList;

public class StudentRepositoryMock implements StudentRepository {

	ArrayList<Student> students = new ArrayList<Student>();
	@Override
	public Student getStudent(int id) {

		Student result = null;
		for (Student s: students){
			if (s.getId() ==id){
				result = s;
				break;
			}
		} 
		return result;
	}

	@Override
	public void saveStudent(Student student) {

		Student studentToSave = null;
		for (Student s: students){
			if (s.getId() == student.getId()){
				studentToSave = s;
				break;
			}
		}
		
		if (studentToSave == null){
			students.add(student);
		} else {
			studentToSave.setFirstName(student.getFirstName());
			studentToSave.setLastName(student.getLastName());
		}
		
	}

}
