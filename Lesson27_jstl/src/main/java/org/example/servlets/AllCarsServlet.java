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

@WebServlet("/allcars")
public class AllCarsServlet extends HttpServlet {
    CarService service = new CarServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        populateCars(req);
        req.getRequestDispatcher("/action.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("search");
        if (search == null || search.isEmpty()) {
            populateCars(req);
        } else {
            List<Car> byId = service.getById(Long.parseLong(search));
            req.setAttribute("cars", byId);
        }


        req.getRequestDispatcher("/action.jsp").forward(req, resp);
    }

    private void populateCars(HttpServletRequest request) {
        request.setAttribute("cars", service.getAll());

    }
}