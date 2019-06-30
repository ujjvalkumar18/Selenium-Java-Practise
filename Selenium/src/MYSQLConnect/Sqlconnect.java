package MYSQLConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sqlconnect {

	@Test
	public void testdb() throws ClassNotFoundException, SQLException{
		//It will load the driver.
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root", "selenium");
		System.out.println("Connection to MySql DB");
		Statement stmt= con.createStatement();
		System.out.println("Statement Created");
		ResultSet rs=stmt.executeQuery("select * from employee");
		
		System.out.println("Statement Executed");
		System.out.println(rs);
		while(rs.next()){
			String sal=rs.getString("name");
			System.out.println("name "+ sal);
		}
		
		con.close();
		
	}
}
