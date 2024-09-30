package june_jdbc_demo;
import java.sql.*;
//insert a data in sql
public class Create {
	public static void main(String[] args) {
		try {
			//connect to db
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
			//write sql query
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("insert into hospital values('3','raam','raam@gmail.com','202020200')");
			//close connection
			con.close();
		} catch (Exception e) {
			  
			e.printStackTrace();
		}
	}

}
