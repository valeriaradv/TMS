package org.example;

public class Worker extends Employee {

    public Worker(){
        position = Position.WORKER;
    }
    public Worker(String firstName, String secondName, double workExperience) {
        super(firstName, secondName, workExperience);
        position = Position.WORKER;
    }


}
