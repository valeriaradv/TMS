package org.example;

import org.example.servlets.StartServlet;

import java.util.List;

import java.sql.*;
import java.util.ArrayList;


public class CarServiceImpl implements CarService {
    StartServlet servlet = new StartServlet();

    @Override
    public void save(Car car) {
        try {
            Connection connection = servlet.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into car (id,brand, year) values (?,?,?)");
            preparedStatement.setLong(1, car.getId());
            preparedStatement.setString(2, car.getBrand());
            preparedStatement.setLong(3, car.getYear());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("SQL ADD");
        }


    }

    @Override
    public void delete(Long id) {
        try {
            Connection connection = servlet.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from car where id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("SQL DELETE");
        }

    }

    @Override
    public void update(Car car) {
        try {
            Connection connection = servlet.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update car set brand = ?,year = ? where id = ?");
            preparedStatement.setString(1,car.getBrand());
            preparedStatement.setLong(2,car.getYear() );
            preparedStatement.setLong(3, car.getId());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException("SQL UPDATE");
        }

    }

    @Override
    public List<Car> getAll() {
        try {
            Connection connection = servlet.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from car");
            return get(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException("SQL EXCEPTION");
        }


    }

    @Override
    public List<Car> getById(Long id) {
        try {
            Connection connection = servlet.getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from car where id = ?");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            return get(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException("SQL EXCEPTION");
        }
    }

    private List<Car> get(ResultSet resultSet) {
        List<Car> cars = new ArrayList<>();
        try {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String brand = resultSet.getString("brand");
                long year = resultSet.getLong("year");
                Car car = new Car(id, brand, year);
                cars.add(car);
            }
        } catch (SQLException e) {
            throw new RuntimeException("SQL EXCEPTION");
        }
        return cars;
    }
}