import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCustomer {

	public static void main(String[] args) {
	
		createCustomer();

	}
		public static void createCustomer(){
			
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
				String sql ="insert into customer (firstname,lastname,email) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "Darling"); 
				pstmt.setString(2, "Reddy"); 
				pstmt.setString(3, "DarlingReddy@gmail.com"); 
 
				int rowCount  =pstmt.executeUpdate();
				System.out.println(rowCount);
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


