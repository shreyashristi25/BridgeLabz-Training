package com.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/student_db"; // your DB name
            String user = "root"; // your MySQL username
            String password = "Shreya@2002"; // your MySQL password

            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
        return connection;
    }

}
