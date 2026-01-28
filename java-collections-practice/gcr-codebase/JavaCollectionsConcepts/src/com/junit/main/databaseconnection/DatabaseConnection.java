package com.junit.main.databaseconnection;

public class DatabaseConnection {

	private boolean connected;

	//methods to connect and disconnect database
    public void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    //method to check connection
    public boolean isConnected() {
        return connected;
    }

}
