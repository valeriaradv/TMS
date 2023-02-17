package org.example.BuilderPattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class House {
    private String material;
    private int floors;
    private Long price;
    private Location location;


    public static final class HouseBuilder {
        private String material;
        private int floors;
        private Long price;
        private Location location;

        private HouseBuilder() {
        }

        public static HouseBuilder builder() {
            return new HouseBuilder();
        }

        public HouseBuilder withMaterial(String material) {
            this.material = material;
            return this;
        }

        public HouseBuilder withFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder withPrice(Long price) {
            this.price = price;
            return this;
        }

        public HouseBuilder withLocation(Location location) {
            this.location = location;
            return this;
        }

        public House build() {
            House house = new House();
            house.price = this.price;
            house.material = this.material;
            house.location = this.location;
            house.floors = this.floors;
            return house;
        }
    }
}
