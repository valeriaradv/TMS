package org.example;

import java.util.List;

public interface CarService {
    void save(Car car);

    void delete(Long id);

    void update(Car car);

    List<Car> getAll();

    List<Car> getById(Long id);

}
