package com.junit.test.taskmanager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import com.junit.main.taskmanager.*;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

	@Test
	@Timeout(2) 
	void testLongRunningTaskTimeout() {
	    TaskManager manager = new TaskManager();
	    String result = manager.longRunningTask();
	    assertEquals("Task completed", result);
	}


}

