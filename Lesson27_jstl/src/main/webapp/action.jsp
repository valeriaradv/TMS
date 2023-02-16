<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<br>
<table style="width:30%">
    <tr>
        <th>Id</th>
        <th>Brand</th>
        <th>Year</th>
        <th>Delete</th>
        <th>Update</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td><c:out value="${car.id}"/></td>
            <td><c:out value="${car.brand}"/></td>
            <td><c:out value="${car.year}"/></td>
            <td>
                <form action="delete" method="post">
                    <input type="hidden" name="id" value="${car.id}">
                    <input type="submit" value="delete"><br>
                </form>
            </td>
            <td>
                <a href="/update?id=<c:out value='${car.id}' />">Update</a>
            </td>
        </tr>

    </c:forEach>
</table>
<br>
<form action="allcars" method="post">
    <input type="text" name="search" placeholder="find by id"><br>
    <input type="submit" value="find">
</form>
<br>


</body>
</html>
