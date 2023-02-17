package org.example.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class DepartmentThree implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Work work = (Work) arg;
        System.out.println(" DepartmentTree :" + work.getWorkToDo());

    }
}