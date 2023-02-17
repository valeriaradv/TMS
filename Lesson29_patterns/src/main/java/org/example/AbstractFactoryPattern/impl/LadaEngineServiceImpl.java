package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.Engine;
import org.example.AbstractFactoryPattern.services.EngineService;

public class LadaEngineServiceImpl implements EngineService {
    @Override
    public Engine createEngine() {
        return new Engine("Lada engine");
    }
}
