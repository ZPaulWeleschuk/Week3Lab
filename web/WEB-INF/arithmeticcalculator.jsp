<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 25, 2021, 10:04:29 PM
    Author     : 843876
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic" >
            First number: <input type="text" name="number1" value="${number1}"><br>
            Second number: <input type="text" name="number2" value="${number2}"><br>
            <input type="submit" name="action" value="+">
            <input type="submit" name="action" value="-">
            <input type="submit" name="action" value="*">
            <input type="submit" name="action" value="%">
        </form>
        Result: <p>${message}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
