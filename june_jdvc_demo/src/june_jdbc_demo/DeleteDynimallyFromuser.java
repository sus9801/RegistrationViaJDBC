package june_jdbc_demo;
import java.util.Scanner;
import java.sql.*;

public class DeleteDynimallyFromuser {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the name  which u want to delete(whole column)");
		String name=sc.nextLine();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
		Statement stmnt=con.createStatement();
		stmnt.executeUpdate("delete from hospital where name='"+name+"' ");
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
