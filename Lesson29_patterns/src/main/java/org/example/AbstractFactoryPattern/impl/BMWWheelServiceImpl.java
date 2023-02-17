package org.example.AbstractFactoryPattern.impl;

import org.example.AbstractFactoryPattern.Wheel;
import org.example.AbstractFactoryPattern.services.WheelService;

public class BMWWheelServiceImpl implements WheelService {
    @Override
    public Wheel createWheel() {
        return new Wheel("BMW wheels");
    }
}