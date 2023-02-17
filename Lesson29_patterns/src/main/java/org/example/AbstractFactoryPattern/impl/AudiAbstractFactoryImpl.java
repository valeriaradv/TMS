package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.AbstractFactory;
import org.example.AbstractFactoryPattern.services.BodyService;
import org.example.AbstractFactoryPattern.services.EngineService;
import org.example.AbstractFactoryPattern.services.WheelService;

public class AudiAbstractFactoryImpl implements AbstractFactory {
    @Override
    public EngineService getEngineService() {
        return new AudiEngineServiceImpl();
    }

    @Override
    public BodyService getBodyService() {
        return new BMWBodyServiceImpl();
    }

    @Override
    public WheelService getWheelService() {
        return new AudiWheelServiceImpl();
    }
}