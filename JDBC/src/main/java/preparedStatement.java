import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatement {

	public static void main(String[] args) {
		
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


