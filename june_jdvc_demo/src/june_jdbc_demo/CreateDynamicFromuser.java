package june_jdbc_demo;
import java .util.Scanner;
import java.sql.*;
public class CreateDynamicFromuser {
	public static void main(String[] args) {
    try {
    	Scanner sc=new Scanner (System.in);
    System.out.println("Enter the Serial number:-");
    	String sr_no=sc.nextLine();
    	System.out.println("Enter the name:-");
    	String name= sc.nextLine();
    	System.out.println("Enter email:-");
    	String email=sc.nextLine();
    	System.out.println("Enter Mobile number");
    	String mobile=sc.nextLine();
    	
    	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb", "root","test");
    	Statement stmnt=con.createStatement();
    	stmnt.executeUpdate("insert into hospital values ('"+sr_no+"','"+name+"','"+ email+"','"+mobile+"'  )");
    	con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}		
	}

}
