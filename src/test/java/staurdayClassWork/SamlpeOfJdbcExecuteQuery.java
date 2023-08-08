package staurdayClassWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SamlpeOfJdbcExecuteQuery {

	public static void main(String[] args) throws Throwable {
		
		//get driver from my sql and register this in driver manager
		Driver driverref = new Driver();
		
		//step1: register the driver 
		DriverManager.registerDriver(driverref);
		
		
		//step2: get the connection with driver--provide db name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "abc123");
		
		//step3: issue create statement
		Statement sta = con.createStatement();
		
		//Step4: execute the query
		ResultSet result = sta.executeQuery("select* from sampletable;");
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		//step 5: close the database
		
		con.close();
	}

}
