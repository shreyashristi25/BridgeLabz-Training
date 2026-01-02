package com.linkedlist.singlylinkedlist.socialmediafriendconnections;
import java.util.* ;
public class UserNode {

	int userId;
    String name;
    int age;
    ArrayList<Integer> friends; // list of friend IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }

}
