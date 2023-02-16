package org.example.servlets;

import org.example.Car;
import org.example.CarService;
import org.example.CarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddCarServlet extends HttpServlet {
    CarService service = new CarServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        String brand = req.getParameter("brand");
        Long year = Long.parseLong(req.getParameter("year"));
        Car car = new Car(id, brand, year);
        service.save(car);
        req.getRequestDispatcher("/allcars").forward(req, resp);

    }
}
