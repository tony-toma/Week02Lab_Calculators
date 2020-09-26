<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2020, 11:00:34 AM
    Author     : 718707
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="firstNumber"/>
            <br>
            <label>Second: </label>
            <input type="text" name="secondNumber"/>
            <br>
            <input type="submit" name="symbol" value="+">
            <input type="submit" name="symbol" value="-">
            <input type="submit" name="symbol" value="*">
            <input type="submit" name="symbol" value="%">
            <br>
            <p>Result ${result}</p>
            <a href="age">Age Calculator</a>
        </form>
        
    </body>
</html>
