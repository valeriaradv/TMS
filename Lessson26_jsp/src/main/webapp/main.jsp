<%@ page import="org.example.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table style="width:30%">
    <th>Id</th>
    <th>Brand</th>
    <th>Year</th>
    <th>Delete</th>
    </tr>
    <br><br>
    <form action="search" method="get">
        <input type="text" name="id" placeholder="Enter the id"/>
        <input type="submit" value="Search">
    </form>
    <br><br>

    <%
        List<Car> cars = (List<Car>) request.getAttribute("cars");
        if (cars != null && !cars.isEmpty()) {
            for (Car car : cars) {
                out.println("<tr><td>" + car.getId() + "</td>");
                out.println("<td>" + car.getBrand() + "</td>");
                out.println("<td>" + car.getYear() + "</td>");
                out.println("<td>" + car.getCountry() + "</td>");
                out.println("</tr>");
            }
        }
    %>

</table>
<br>
<h4>Delete car</h4>
<form method="post" action="delete">
    <input type="text" name="id" placeholder="Enter car's id"/>
    <input name="delete" type="submit" value="Delete car">
</form>
<br>
<h4>Add new car</h4>
<form method="post" action="addcar">
    <input type="number" name="id" placeholder="car id"><br><br>
    <input type="text" name="brand" placeholder="car brand"><br><br>
    <input type="text" name="year" placeholder="car year"><br><br>
    <input type="text" name="country" placeholder="car country"><br><br>
    <input name="addcar" type="submit" value="Add car"><br>
</form>
</body>
</html>
