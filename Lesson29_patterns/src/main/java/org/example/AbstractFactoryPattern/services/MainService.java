package org.example.AbstractFactoryPattern.services;

import org.example.AbstractFactoryPattern.AbstractFactory;
import org.example.AbstractFactoryPattern.Body;
import org.example.AbstractFactoryPattern.Engine;
import org.example.AbstractFactoryPattern.Wheel;

public class MainService {
    public void createCar(AbstractFactory factory) {
        EngineService engineService = factory.getEngineService();
        Engine engine = engineService.createEngine();
        System.out.println(engine);

        BodyService bodyService = factory.getBodyService();
        Body body = bodyService.createBody();
        System.out.println(body);

        WheelService wheelService = factory.getWheelService();
        Wheel wheel = wheelService.createWheel();
        System.out.println(wheel);

    }
}
