package org.example.servlets;

import org.example.Car;
import org.example.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/start")
public class MainServlet extends HttpServlet {
    CarService service = new CarService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Car> cars = service.allCars();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }
}