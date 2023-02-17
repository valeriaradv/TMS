package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.Engine;
import org.example.AbstractFactoryPattern.services.EngineService;

public class AudiEngineServiceImpl implements EngineService {
    @Override
    public Engine createEngine() {
        return new Engine("Audi engine");
    }
}