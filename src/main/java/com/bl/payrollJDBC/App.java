package com.bl.payrollJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bl.classes.UC1;

/**
 * Hello world!
 *
 */
public class App {
	static UC1 uc1 = new UC1();
	static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
	static final String USERNAME = "root";
	static final String PASSWORD = "Pratik@22";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		uc1.checkForConnection(URL, USERNAME, PASSWORD);
	}
}
