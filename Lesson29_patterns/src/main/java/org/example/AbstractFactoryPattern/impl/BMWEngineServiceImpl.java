package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.Engine;
import org.example.AbstractFactoryPattern.services.EngineService;

public class BMWEngineServiceImpl implements EngineService {
    @Override
    public Engine createEngine() {
        return new Engine("BMW engine");
    }
}
