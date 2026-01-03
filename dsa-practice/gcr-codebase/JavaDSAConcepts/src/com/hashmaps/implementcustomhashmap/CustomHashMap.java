package com.hashmaps.implementcustomhashmap;
import java.util.*;

public class CustomHashMap {

	private Map<String, Integer> map;

	//constructor
    public CustomHashMap() {
        map = new HashMap<>();
    }

    //methods to add, get, remove and display elements
    public void put(String key, int value) {
        map.put(key, value);
    }

    public Integer get(String key) {
        return map.get(key);
    }

    public void remove(String key) {
        map.remove(key);
    }

    public void display() {
        System.out.println(map);
    }
}


