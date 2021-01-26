<%-- 
    Document   : ageCalculator
    Created on : Jan 25, 2021, 8:13:31 PM
    Author     : 843876
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age" >
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next Birthday!">
        </form>
            <p>${message}</p>
            <a href="https://www.w3schools.com">Arithmetic Calculator</a>
    </body>
</html>
