package com.jnit.oca2017.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectionMain {
	// executeQuery -> resultset
	// executeUpate -> int -> insert,update, delete operations
	// execute -> boolean(true -resultset, false-int) -> both executequery and
	// executeupdate both can be performed

	public static void getCourseDetails() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRegistrationjdbc2","root", "");
			Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			boolean bool = statement.execute("SELECT * FROM JNIT_COURSE");
			// ResultSet rset1 = statement.executeQuery("select * from course");
			if (bool) {
				ResultSet rset = statement.getResultSet();
				List<Course> courses = new ArrayList<>();
				while (rset.next()) {
					Course course = new Course(rset.getString("CourseID"),rset.getString("CourseName"));
					courses.add(course);

				}
				System.out.println(courses);

			} else {
				int count = statement.getUpdateCount();
				System.out.println(count);
			}
			// statement.close();
		} catch (SQLException e) {
			// e.printStackTrace();
			e.getSQLState();
			e.getErrorCode();
			e.getMessage();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

		}

	}

	public static void getCourseDetailswithResources(String courseID) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRegistrationjdbc", "root","");
				Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);) {
			boolean bool = statement.execute("SELECT * FROM JNIT_COURSE WHERE COURSEID ='"+ courseID + "'");

			if (bool) {
				ResultSet rset = statement.getResultSet();
				List<Course> courses = new ArrayList<>();
				if (rset.next()) {
					Course course = new Course(rset.getString("CourseID"),
							rset.getString("CourseName"));
					courses.add(course);
					System.out.println(courses);
				}
			} else {
				int count = statement.getUpdateCount();
				System.out.println(count);
			}
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}

	}

	public static void getCourseDetailsWithPreparedStatement(String courseID) {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRegistrationjdbc","root", "");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM JNIT_COURSE WHERE COURSEID = ?");
			statement.setString(1, courseID);
			ResultSet rset = statement.executeQuery();

			if (rset.next()) {
				System.out.print(rset.getString("COURSENAME"));

			}
			connection.close();
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}

		finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

		}

	}

	public static void main(String[] args) {
		getCourseDetails();
		//getCourseDetailswithResources("JAVA101");
		//getCourseDetailsWithPreparedStatement("JAVA101");

	}

}
