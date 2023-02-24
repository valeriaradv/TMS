package org.example;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public Director() {
        position = Position.DIRECTOR;
    }

    public Director(String firstName, String secondName, double workExperience, List<Employee> employees) {
        super(firstName, secondName, workExperience);
        position = Position.DIRECTOR;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public double salary() {
        return super.salary() + employees.size() * 1000;
    }

    @Override
    public String toString() {
        return "\nDirector: " +
                "\n name: " + super.getFirstName() +" "+ super.getSecondName() +
                "\n salary: " + salary() +
                "\n employees: " + getEmployees();
    }
}
