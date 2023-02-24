package org.example;

public enum Position {
    DIRECTOR(5.5),
    WORKER(2.5);
    double coefficient;

    Position(double coefficient) {
        this.coefficient = coefficient;
    }
}
