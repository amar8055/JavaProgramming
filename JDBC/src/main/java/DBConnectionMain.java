import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnectionMain {

	public static void main(String[] args) 
	{
/*		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root");
			String sql ="select * from customer";// It creates on row to access it we can itterate over it.
			Statement stmt = con.createStatement();
			ResultSet rs  =stmt.executeQuery(sql);
			while(rs.next())
			{
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getInt("ID"));
			System.out.println(rs.getString(3));
			}
			stmt.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		printAllTheCustomersWithSameLastName("Amar");
	}	
		public static void printAllTheCustomersWithSameLastName(String fname){
			
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
			String sql ="Select firstname,lastname from customer where firstname=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fname);
			ResultSet rs  =pstmt.executeQuery();
			while(rs.next())
			{
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("lastname"));
//			System.out.println(rs.getInt("ID"));
//			System.out.println(rs.getString(3));
			}
			pstmt.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		
		
		
		
}		

  


