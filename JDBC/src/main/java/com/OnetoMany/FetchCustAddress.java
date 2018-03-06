package com.OnetoMany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FetchCustAddress {

	public static void main(String[] args) {
		

		FetchCustomersAndOrders();
		//FetchCustomersAndAddress();
	}
	
//	public static void FetchCustomersAndAddress(){
//		
//		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
//			String sql ="select * from customer c join address a on c.id=a.customer_id where c.id=?";
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 1);
//			ResultSet rs  =pstmt.executeQuery();
//			customer c = new customer();//since we have only one customer we can put it outside while loop.
//			List<Orders>orders=new ArrayList<>();
//			while(rs.next())
//			{ 
////			System.out.println(rs.getString("firstname"));
////			System.out.println(rs.getString("lastname"));
////			System.out.println(rs.getString("city"));
//				
//				c.setFirstname(rs.getString("firstname"));
//				address a = new address();
//				a.setCity(rs.getString("city"));
//				c.setAddress(a);
//					
//			}
//			pstmt.close();
//			con.close();
//			System.out.println(c.getFirstname());
//			System.out.println(c.getAddress().getCity());
//		} 
//		catch (SQLException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	//}

	public static void FetchCustomersAndOrders(){
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
			String sql ="select * from customer c join T_Orders o on c.id=o.customer_id where c.id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			ResultSet rs  =pstmt.executeQuery();
			
			
			customer c = new customer();//since we have only one customer we can put it outside while loop.
			List<Orders>orders=new ArrayList();
			c.setOrders(orders);
			Orders o = new Orders();
			while(rs.next())
			{ 
				if(c.getFirstname() ==null)
				{
				c.setFirstname(rs.getString("firstname"));	
				}
				//Orders o = new Orders();
				o.setOrder_Desc(rs.getString("Order_Desc"));
				c.getOrders().add(o);
								
			}
			pstmt.close();
			con.close();
			System.out.println(c.getFirstname());
			System.out.println(c.getOrders().toString());
			System.out.println(c.getOrders().add(o));
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
