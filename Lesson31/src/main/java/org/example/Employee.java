package org.example;

public abstract class Employee {
    private String firstName;
    private String secondName;
    private double workExperience;
    protected Position position;
    public static final int BASE = 200;


    public double salary() {
        if (workExperience != 0) {
            return BASE * position.coefficient * workExperience;
        } else {
            return BASE * position.coefficient;
        }

    }

    protected Employee() {
    }

    public Employee(String firstName, String secondName, double workExperience) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.workExperience = workExperience;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getSecondName() {
        return secondName;
    }


    public double getWorkExperience() {
        return workExperience;
    }


    @Override
    public String toString() {
        return "\nEmployee: " +
                "\n name: " + firstName + " " + secondName +
                "\n salary: " + salary();
    }
}
