package org.example.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(value = "/init", loadOnStartup = 1)
public class StartServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) {
        try {
            Class.forName("org.postgresql.Driver");
            getConnection().createStatement().execute("drop table if exists car ");
            getConnection().createStatement().execute("" +
                    " create table car(" +
                    " id int primary key," +
                    " brand varchar," +
                    " year int" +
                    ")");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/car", "postgres", "0191");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}