package edu.sbcc.cs105;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class StudentRepository {

	private static Connection connect = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;	
	private PreparedStatement preparedStatement = null;
	private String connectionString;
	
	public StudentRepository(String connectionString) throws ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");	
		this.connectionString = connectionString;
	}
	public Student create(Student student) throws SQLException{
		
		final String SQL_INSERTSTUDENT = "";
		
		
		try {
			connect = getConnection();
			
			preparedStatement = connect.prepareStatement(SQL_INSERTSTUDENT, Statement.RETURN_GENERATED_KEYS);
			
			// set parameters
			//TODO: SET PARAMETERS preparedStatement.setString(1, item.param1);
			
			
			
			int numRecords = preparedStatement.executeUpdate();
			ResultSet keys = preparedStatement.getGeneratedKeys();
			keys.next();
			
			//int id = keys.getInt(1);
			//student.setId(id);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
			throw e;
		} finally{
			close();
		}
				
		return student;
	}
	
	public Student get(int id) throws SQLException{
		
		final String SQL_GETSTUDENT = "";
		
		Student result = null;
		
		String sql = SQL_GETSTUDENT + id;
		List<Student> students = executeQuery(sql);
		
		if (students.size() > 0){
			result = students.get(0);
		}
		
		return result;
	}
	
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.connectionString);
	}
	
	private List<Student>  executeQuery(String query) throws SQLException{
		
		List<Student> result = new ArrayList<Student>();
		
		try {
			connect = getConnection();
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(query);
			result = mapResultSet(resultSet);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally{
			close();
		}
		
		return result;
	}
	private List<Student> mapResultSet(ResultSet resultSet) throws SQLException {

		ArrayList<Student> result = new ArrayList<Student>();
		
		while (resultSet.next()) {			
			Student student = new Student();
			//TODO student.setId(resultSet.getInt("id"));
			
			result.add(student);
		}
		
		return result;
	}
	
	private void close() {
	    try {
	      if (resultSet != null) {
	        resultSet.close();
	      }

	      if (statement != null) {
	        statement.close();
	      }

	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	  }

	
}
