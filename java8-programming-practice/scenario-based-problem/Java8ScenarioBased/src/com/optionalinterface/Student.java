package com.optionalinterface;
import java.util.* ;

public class Student {

	int id;
    String name;
    Optional<String> email;
    Optional<String> phone;
    Optional<String> address;
    Optional<String> nickname;

    //constructor
    public Student(int id, String name, String email, String phone, String address, String nickname) {
        this.id = id;
        this.name = name;
        this.email = Optional.ofNullable(email);
        this.phone = Optional.ofNullable(phone);
        this.address = Optional.ofNullable(address);
        this.nickname = Optional.ofNullable(nickname);
    }

}
