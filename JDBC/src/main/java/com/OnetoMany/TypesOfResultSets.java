package com.OnetoMany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TypesOfResultSets {

public static void main(String[] args) {
	printAllTheCustomersWithSameLastName();
}		
		public static void printAllTheCustomersWithSameLastName(){
			
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
			String sql ="Select * from customer";
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs  =stmt.executeQuery(sql);
			rs.next();
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString(3));
			rs.first();
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("id"));  
			System.out.println(rs.getString(3));
			rs.next();
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString(3));
			rs.previous();
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString(3));
			rs.next();
			
			stmt.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}





