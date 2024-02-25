package com.example.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static final String Driver_Class="com.mysql.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/practiceJSJ";
	public static final String USERNAME="root";
	public static final String PASSWORD="123456";
	public static Connection dbConn() throws ClassNotFoundException, SQLException {
	Class.forName(Driver_Class);
	Connection con=DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	return con;
	}
}
