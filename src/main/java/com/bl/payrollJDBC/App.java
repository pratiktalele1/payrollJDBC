package com.bl.payrollJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bl.classes.UC1;
import com.bl.classes.UC2;
import com.bl.classes.UC3;
import com.bl.classes.UC4;
import com.bl.classes.getConnection;

/**
 * Hello world!
 *
 */
public class App {
	static UC1 uc1 = new UC1();
	static UC2 uc2 = new UC2();
	static UC3 uc3 = new UC3();
	static UC4 uc4 = new UC4();
	
	static getConnection connection = new getConnection();
	static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
	static final String USERNAME = "root";
	static final String PASSWORD = "Pratik@22";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		uc1.checkForConnection(URL, USERNAME, PASSWORD);
		uc2.retriveData(connection.connect());
		uc3.updateDetail(connection.connect());
		uc4.updateSalary(connection.connect());
	}
}
