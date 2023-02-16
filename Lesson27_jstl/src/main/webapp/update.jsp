<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Update car</h4>
<form method="post">
    <input type="hidden" value="${car.id}" name="carup" />
    <label>Brand</label><br>
    <input name="brand" value="${car.brand}" /><br><br>
    <label>Year</label><br>
    <input name="year" value="${car.year}" type="number" /><br><br>
    <input type="submit" value="Send" />
</form>
</body>
</html>
