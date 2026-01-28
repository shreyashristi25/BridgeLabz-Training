package com.junit.main.listmanager;
import java.util.* ;

public class ListManager {

	//methods to add element, remove element and get size of the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }

}
