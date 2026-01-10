package com.historymanager;

public class History {

	String url;
    History prev, next;

    //constructor
    History(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
