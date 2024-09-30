package june_jdbc_demo;
import java.sql.*;
public class Update {
	public static void main(String[] args) {
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/junedbs","root","test");
			Statement  stmt=con.createStatement();
			stmt.executeUpdate("update  registration set email='saihna@gmail.com' where name='sai'");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
