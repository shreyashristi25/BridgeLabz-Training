package com.annotation.todo;

public class ProjectFeatures {

	@Todo(task = "Implement user login", assignedTo = "Shreya", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Add payment gateway integration", assignedTo = "Shristi")
    public void paymentFeature() {}

    @Todo(task = "Optimize search algorithm", assignedTo = "Priya", priority = "LOW")
    public void searchFeature() {}

}
