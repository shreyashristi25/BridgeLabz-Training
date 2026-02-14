package com.jdbc.establishingdatabaseconnection;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;

public class DatabaseConnection {

	public static Connection getConnection() {
        Connection connection = null;
        try {
            // Hardcoded connection details
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "Shreya@2002";

            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("Connection is active.");
            } else {
                System.out.println("Connection is null.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
