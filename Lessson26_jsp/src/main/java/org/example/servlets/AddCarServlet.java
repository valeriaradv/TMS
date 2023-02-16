package org.example.servlets;

import org.example.Car;
import org.example.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addcar")
public class AddCarServlet extends HttpServlet {
    CarService service = new CarService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id"));
        String brand = req.getParameter("brand");
        String year = req.getParameter("year");
        String country = req.getParameter("country");
        service.save(new Car(id, brand, year, country));
        req.getRequestDispatcher("main.jsp").forward(req, resp);

    }
}