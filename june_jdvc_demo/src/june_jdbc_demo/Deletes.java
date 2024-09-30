package june_jdbc_demo;
import java.sql.*;
public class Deletes {
public static void main(String[] args) {
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/junedbs","root","test");
		Statement stmnt=con. createStatement();
		stmnt.executeUpdate("delete from registration where email='mike@gmail.com'");
	
		con.close();
	} catch (Exception e) {
		
		// TODO: handle exception
		System.out.println(e);
	}
}
}
