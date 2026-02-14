package com.jdbc.transaction;
import java.sql.* ;

public class DatabaseConnection {

	public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bank_db";
            String user = "root";
            String password = "Shreya@2002";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
        return connection;
    }

}
