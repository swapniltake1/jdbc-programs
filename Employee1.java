import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Employee1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
    try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		// Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/swapnildb","root","admin");
		
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/swapnildb","root","admin");
		 
		 System.out.println("Connection Is Done");
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	}

}
