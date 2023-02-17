package org.example.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class DepartmentTwo implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Work work = (Work) arg;
        System.out.println(" DepartmentTwo :" + work.getWorkToDo());

    }
}
