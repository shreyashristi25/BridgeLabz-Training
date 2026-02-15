package com.jdbc.JDBCPractice;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.* ;

public class StudentDAOTest {

	@Test
	public void testGetStudentById() {
	// Create mock objects
	Connection mockConn = mock(Connection.class);
	PreparedStatement mockPstmt = mock(PreparedStatement.class);
	ResultSet mockRs = mock(ResultSet.class);

	try {
	// Setup mock behavior
	when(mockConn.prepareStatement(anyString())).thenReturn(mockPstmt);
	when(mockPstmt.executeQuery()).thenReturn(mockRs);
	when(mockRs.next()).thenReturn(true);
	when(mockRs.getInt("id")).thenReturn(1);
	when(mockRs.getString("name")).thenReturn("John Doe");
	when(mockRs.getString("email")).thenReturn("john@email.com");
	when(mockRs.getInt("age")).thenReturn(20);
	when(mockRs.getString("grade")).thenReturn("A");

	// Test would go here
	// StudentDAO dao = new StudentDAO(mockConn);
	// Student student = dao.getStudentById(1);
	// assertEquals("John Doe", student.getName());

	} catch (SQLException e) {
	fail("SQLException thrown");
	}
	}
}
