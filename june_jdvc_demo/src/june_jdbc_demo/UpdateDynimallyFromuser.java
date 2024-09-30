 package june_jdbc_demo;
import java.util.Scanner;
import java.sql.*;

public class UpdateDynimallyFromuser {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		 String name =sc.nextLine();
		 System.out.println("Enter mobile no which u want to update");
		 String mobile=sc.next();
		 Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
		 Statement stmt=c.createStatement();
		 stmt.executeUpdate("update hospital set mobile='"+mobile+"' where name='"+name+"'");
		 c.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
