package com.jnit.oca2017.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//rset.absolute(+ve - forward, negative- backward), rset.relative(+x number if rows forward, -x number of rows backward)
//sensitive -> sensitive tochanges happening to the db outside your program
//updatable -> you can make changes to the resultset and save the changes back to ur db
public class ScrolltypeDemo {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRegistrationjdbc", "root","");
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rset = statement.executeQuery("SELECT * from JNIT_COURSE");
			
			List<Course> courses = new ArrayList<>();
			while (rset.next()) {
				Course course = new Course(rset.getString("CourseID"),rset.getString("CourseName"));
				courses.add(course);
				
				
			}
			System.out.println("Printing courses");
			System.out.println(courses);
			
			System.out.println();
			rset.first();
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
			
			rset.last();
			
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
	
			//rset.afterLast();
			rset.absolute(3);
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
			
			rset.absolute(-2);
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
			
			rset.absolute(1);
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
			
			rset.relative(3);
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
			
			rset.relative(-2);
			System.out.print(rset.getString("CourseID"));
			System.out.print(rset.getString("CourseName"));
			System.out.println();
			
			
			

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
	}

}
