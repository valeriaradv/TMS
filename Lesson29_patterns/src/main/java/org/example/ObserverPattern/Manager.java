package org.example.ObserverPattern;

import java.util.Observable;

public class Manager extends Observable {
    public void whatToDo(Work work) {
        System.out.println("Work to do: ");
        setChanged();
        notifyObservers(work);
    }
}
