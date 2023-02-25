package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Director director1 = new Director("Sam", "Dir", 2.0, employees);
        Worker worker1 = new Worker("Pit", "Smith", 2.3);
        Worker worker2 = new Worker("Liz", "Johnson", 1.6);

        System.out.println("\n-------имя сотрудника и зп---------");
        System.out.println(worker1 + "\n" + worker2);

        employees.add(worker1);
        employees.add(worker2);

        System.out.println("\n-------директор и подчиненные---------");
        System.out.println(director1);

        System.out.println("\n-------директор под управлением другого директора---------");
        List<Employee> employeeList = new ArrayList<>();
        Worker worker3 = new Worker("Pam", "Stivenson", 2.0);
        employeeList.add(worker3);
        Director director2 = new Director("Ron", " Director", 2.0, employeeList);
        director2.addEmployee(director1);
        System.out.println(director2);

        System.out.println("\n-------поиск подчиненных---------");
        SearchService service = new SearchService();
        String search = service.employeeSearch("Sam", "Dir", director2);
        String search2 = service.employeeSearch("Lor", "Not", director1);
        System.out.println(search);
        System.out.println(search2);

    }
}