package com.annotation.roleallowed;

public class SecureService {

	@RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed successfully!");
    }

    //method to open a task
    public void openTask() {
        System.out.println("Open task executed by anyone!");
    }

}
