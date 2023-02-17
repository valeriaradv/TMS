package org.example.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        DepartmentOne departmentOne = new DepartmentOne();
        DepartmentTwo departmentTwo = new DepartmentTwo();
        DepartmentThree departmentThree = new DepartmentThree();
        Manager manager = new Manager();

        manager.addObserver(departmentOne);
        manager.addObserver(departmentTwo);
        manager.addObserver(departmentThree);

        manager.whatToDo(new Work("Message one"));

        manager.deleteObserver(departmentOne);
        manager.deleteObserver(departmentThree);

        manager.whatToDo(new Work("message two"));
    }
}