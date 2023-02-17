package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.services.BodyService;
import org.example.AbstractFactoryPattern.services.EngineService;
import org.example.AbstractFactoryPattern.services.WheelService;

public interface AbstractFactory {
    EngineService getEngineService();
    BodyService getBodyService();
    WheelService getWheelService();

}