package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.AbstractFactory;
import org.example.AbstractFactoryPattern.services.BodyService;
import org.example.AbstractFactoryPattern.services.EngineService;
import org.example.AbstractFactoryPattern.services.WheelService;

public class LadaAbstractFactoryImpl implements AbstractFactory {
    @Override
    public EngineService getEngineService() {
        return new LadaEngineServiceImpl();
    }

    @Override
    public BodyService getBodyService() {
        return new LadaBodyServiceImpl();
    }

    @Override
    public WheelService getWheelService() {
        return new AudiWheelServiceImpl();
    }
}
