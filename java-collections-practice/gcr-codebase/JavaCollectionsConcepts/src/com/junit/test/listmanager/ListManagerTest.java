package com.junit.test.listmanager;
import com.junit.main.listmanager.* ;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        assertTrue(list.contains(10), "List should contain the added element");
        assertEquals(1, listManager.getSize(list), "List size should be 1 after adding an element");
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 20);
        listManager.removeElement(list, 20);
        assertFalse(list.contains(20), "List should not contain the removed element");
        assertEquals(0, listManager.getSize(list), "List size should be 0 after removing the element");
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        assertEquals(2, listManager.getSize(list), "List size should reflect number of elements added");
    }
}
