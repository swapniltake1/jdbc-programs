import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Emp {
	static String driver="com.mysql.jdbc.Driver";
	static String conString="jdbc:mysql://localhost:3308/swapnildb";
	static String user="root";
	static String pass="admin";
	
public static void main(String[] args) throws SQLException,ClassNotFoundException {

		
	try {
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(conString,user,pass);
		System.out.println("Connection Successfullllll");
		java.sql.Statement st=con.createStatement();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name=sc.next();
		
		System.out.println("Enter Employee city");
		String city=sc.next();
		
		System.out.println("Enter Employee Salary");
		float salary=sc.nextFloat();
		
		System.out.println("Enter Employee Dept");
		String dept=sc.next();
		
		String query=String.format("insert into tblemp1 values(%d,'%s','%s',%f,'%s')",id,name,city,salary,dept);
		st.executeUpdate(query);
		
        System.out.println("Successsfulllyyy Submitteddddddd");

		
	} 
	
	
	catch (SQLException e) {
		// TODO: handle exception
		System.out.println("Sql Exception  !!!");
	}
	catch (ClassNotFoundException e) {
		System.out.println("Class Not Found  !!");
		// TODO: handle exception
	}
	catch (Exception e) {
		System.out.println("Connection Fail   !!!!");
	}
		
//	Class.forName(driver);
//	Connection con=DriverManager.getConnection(conString,user,pass);
//	
}
}
