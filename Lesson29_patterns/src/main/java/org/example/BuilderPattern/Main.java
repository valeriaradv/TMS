package org.example.BuilderPattern;
import org.example.BuilderPattern.House.HouseBuilder;

public class Main {
    public static void main(String[] args) {

        House house = HouseBuilder.builder()
                .withMaterial("Material".toUpperCase())
                .withFloors(2)
                .withPrice(2350000L)
                .withLocation(Location.builder()
                        .country("Country")
                        .city("City")
                        .district("District")
                        .build())
                .build();
    }
}
