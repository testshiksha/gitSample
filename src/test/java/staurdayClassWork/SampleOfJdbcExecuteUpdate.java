package staurdayClassWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleOfJdbcExecuteUpdate {
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
	String updation="insert into sampletable value('pooja',15,'india');";
	int result = sta.executeUpdate(updation);
	//validation
	if(result==1)
	{
		System.out.println("data added");
	}
	else {
		System.out.println("data not added");
	}
	ResultSet res = sta.executeQuery("select * from sampletable;");
	while(res.next())
	{
		System.out.println(res.getString(3));
	}
	//close the db
	con.close();

	}
}

