package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.impl.AudiAbstractFactoryImpl;
import org.example.AbstractFactoryPattern.services.MainService;

public class MainApp {
    public static void main(String[] args) {
        MainService service = new MainService();
        service.createCar(new AudiAbstractFactoryImpl());

    }
}
