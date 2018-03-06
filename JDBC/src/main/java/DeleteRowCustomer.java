import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteRowCustomer {

	public static void main(String[] args) {
		
		deleteRowFromCustomerWhereId();
	}

	public static void deleteRowFromCustomerWhereId(){
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febdb", "root","root")){
			String sql ="Delete from customer where firstname='Darling'";
			PreparedStatement pstmt = con.prepareStatement(sql);
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


