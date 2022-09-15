import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class Employee2
{
	static String query="insert into tblemp1 values(102,'Swapnil Take','Pune',45855,'cse')";
	
	
	static String query1="delete from tblemp1 where eId=1";
	
	
	
	static String query2="update tblemp1 set eDepartment='sales' where eId=101";
	
	static String query3="select eId,eName,eCity,eSalary,eDepartment from tblemp1";
	
public static void main(String[] args) throws SQLException,ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
	
	
	
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/swapnildb","root","admin");
	System.out.println("Connection Done !!!!!!!");
	java.sql.Statement st=con.createStatement();
	//  st.executeUpdate(query);       // To insert Record Into Table.
	//  System.out.println("Record Inserted");
	
	//st.executeUpdate(query1);     // To Delete Record From Table.
	//System.out.println("Record Deleted");
	
	//st.executeUpdate(query2);     // To Update Record In Table.
    //System.out.println("Record Updated");
	
	 ResultSet rSet=st.executeQuery(query3);      // Fetch The data from table.
	 while (rSet.next())
	 System.out.println(rSet.getInt(1)+"  "+rSet.getString(2)+"  "+rSet.getString(3)+"  "+rSet.getFloat(4)+"  "+rSet.getString(5));
	 
	 System.out.println(" Record fetched !!!!");
	
}
	
}
