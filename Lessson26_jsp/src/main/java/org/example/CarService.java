package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1L, "Audi", "1996", "Germany"));
        carList.add(new Car(2L, "Bugatti", "2011", "France"));
        carList.add(new Car(3L, "Chevrolet", "2016", "America"));
        carList.add(new Car(4L, "Hyundai", "2006", "South Korea"));
        carList.add(new Car(5L, "Nissan", "2008", "Japan"));
    }

    public Car getCarWithId(long id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }


    public Car save(Car car) {
        carList.add(car);
        return car;
    }

    public void delete(long id) {
        Car del = getCarWithId(id);
        carList.remove(del);
    }

    public List<Car> allCars() {
        return carList;
    }
}

