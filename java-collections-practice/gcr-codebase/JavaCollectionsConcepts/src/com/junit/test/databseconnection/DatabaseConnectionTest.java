package com.junit.test.databseconnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.junit.main.databaseconnection.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect(); 
    }

    @AfterEach
    void tearDown() {
        db.disconnect(); 
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected after @BeforeEach");
    }

    @Test
    void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected after calling disconnect()");
    }
}

