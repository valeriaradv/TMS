package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.Body;
import org.example.AbstractFactoryPattern.services.BodyService;

public class LadaBodyServiceImpl implements BodyService {
    @Override
    public Body createBody() {
        return new Body("Lada body");
    }
}
