package june_jdbc_demo;
import java.sql.*;
public class Read {
public static void main(String[] args) {
	try {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
		Statement s=con.createStatement();
		ResultSet res=s.executeQuery("select * from hospital");
		while(res.next()) {
			System.out.print(res.getString(1)+" ");
			System.out.print(res.getString(2) +" ");
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));

		}
	} catch (Exception e) {
System.out.println(e);
}
}
}
