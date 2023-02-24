package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Worker worker1 = new Worker("Pit", "Smith", 2.3);
        Worker worker2 = new Worker("Liz", "Johnson", 1.6);
        Director director = new Director("Sam", "Dir", 2.0, employees);

//        System.out.println("-------имя сотрудника и зп---------");
//        System.out.println(worker1 + "\n" + worker2);

        employees.add(worker1);
        employees.add(worker2);

//        System.out.println("-------директор и подчиненные---------");
//        System.out.println(director);

        List<Employee> employees1 = new ArrayList<>();
        Worker worker3 = new Worker("Pam", "Stivenson", 2.0);
        employees1.add(worker3);
        Director director2 = new Director("Ron", " Director", 2.0, employees1);
        director2.addEmployee(director);
        System.out.println(director2);


    }
}