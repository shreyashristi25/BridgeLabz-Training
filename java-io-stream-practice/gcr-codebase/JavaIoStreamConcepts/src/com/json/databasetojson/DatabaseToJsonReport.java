package com.json.databasetojson;
import java.sql.*;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class DatabaseToJsonReport {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            //Take database connection details from user
            System.out.print("Enter JDBC URL (e.g., jdbc:mysql://localhost:3306/testdb): ");
            String jdbcUrl = scanner.nextLine();

            System.out.print("Enter DB username: ");
            String username = scanner.nextLine();

            System.out.print("Enter DB password: ");
            String password = scanner.nextLine();

            System.out.print("Enter table name: ");
            String tableName = scanner.nextLine();

            //Connect to database
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);

            JSONArray jsonArray = new JSONArray();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                JSONObject obj = new JSONObject();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = rs.getObject(i);
                    obj.put(columnName, value);
                }
                jsonArray.put(obj);
            }

            // Print JSON report
            System.out.println("\nGenerated JSON Report:");
            System.out.println(jsonArray.toString(4));

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


	}

}
