package com.linkedlist.singlylinkedlist.socialmediafriendconnections;
import java.util.* ;
public class SocialMediaLinkedList {

	private UserNode head;

    // method to add a new user
    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
            return;
        }
        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // method to search user by ID
    public UserNode searchById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    // method to search user by Name
    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // method to add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = searchById(userId1);
        UserNode user2 = searchById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        if (!user1.friends.contains(userId2)) user1.friends.add(userId2);
        if (!user2.friends.contains(userId1)) user2.friends.add(userId1);

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // method to remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = searchById(userId1);
        UserNode user2 = searchById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        user1.friends.remove(Integer.valueOf(userId2));
        user2.friends.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }

    // method to display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        System.out.println(user.name + "'s Friends: " + user.friends);
    }


    // method to count number of friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }

    // method to find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = searchById(userId1);
        UserNode user2 = searchById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        ArrayList<Integer> mutual = new ArrayList<>();
        for (int f1 : user1.friends) {
            if (user2.friends.contains(f1)) {
                mutual.add(f1);
            }
        }

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ": " + mutual);
    }


    // method to display all users
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users in the system!");
            return;
        }
        UserNode temp = head;
        System.out.println("Social Media Users:");
        while (temp != null) {
            System.out.println("ID=" + temp.userId + ", Name=" + temp.name + ", Age=" + temp.age);
            temp = temp.next;
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        // Add users
        sm.addUser(1, "Akash", 25);
        sm.addUser(2, "Bunty", 30);
        sm.addUser(3, "Charlie", 22);
        sm.addUser(4, "Danial", 28);

        sm.displayUsers();

        // add friend connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 4);

        // Display friends
        sm.displayFriends(1);
        sm.displayFriends(2);

        // Find mutual friends
        sm.findMutualFriends(1, 2);

        // Count friends
        sm.countFriends();

        // Remove friend connection
        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
        sm.displayFriends(2);
    }



}
