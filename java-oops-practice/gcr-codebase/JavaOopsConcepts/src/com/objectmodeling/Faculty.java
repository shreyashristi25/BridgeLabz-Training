package com.objectmodeling;

public class Faculty {
	
	private String name;
    private String specialization;

    // Constructor
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Display faculty details
    public void displayFaculty() {
        System.out.println("Faculty: " + name + " | Specialization: " + specialization);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Setter methods (optional, if you want to allow updates)
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


}
