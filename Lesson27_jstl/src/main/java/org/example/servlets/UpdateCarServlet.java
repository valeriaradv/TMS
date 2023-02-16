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
import java.util.List;

@WebServlet("/update")
public class UpdateCarServlet extends HttpServlet {
    CarService service = new CarServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        List<Car> car = service.getById(Long.parseLong(id));
        if (car != null) {
            req.setAttribute("carup", car);
            req.getRequestDispatcher("/update.jsp").forward(req, resp);
        } else {
            resp.getOutputStream().println("not found");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        String brand = req.getParameter("brand");
        Long year = Long.parseLong(req.getParameter("year"));
        Car car = new Car(id, brand, year);
        if (id != null && !brand.isEmpty() && year != null) {
            service.update(car);
        }
        resp.sendRedirect("/allcars");


    }
}
