<%-- 
    Document   : login
    Created on : Jun 8, 2022, 9:11:32 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="css/login.css">
    </head> 
    <body class="text-center">
        <div class="form-signin">
            <img src="image/book.jpg" alt="" class="image"><br>

            <form action="register.html">
                <button class="btn btn-outline-primary w-50" type="submit">
                    Register
                </button>
            </form>

            <form action="LoginController" method="POST">
                <div class="error text-danger text-left">
                    <c:set var="error" value="${requestScope.ERROR}"/>
                    <c:if test="${not empty error}">
                        ${error.wrongAccount}               
                    </c:if><br/>
                </div>
                <div class="form-floating w-100">
                    <input type="text" class="form-control" id="floatingInput" placeholder="username" name="txtUsername" value="${param.txtUsername}">
                    <label for="floatingInput">Username</label>
                </div>
                <div class="error text-danger text-left">
                    <c:if test="${not empty error}">
                        ${error.usernameEmpty}               
                    </c:if><br/>
                </div>
                <div class="form-floating w-100">
                    <input type="password" class="form-control" id="floatingInput" placeholder="password" name="txtPassword" value="">
                    <label for="floatingInput">Password</label>
                </div>
                <div class="error text-danger text-left">
                    <c:if test="${not empty error}">
                        ${error.passwordEmpty}                
                    </c:if><br/>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="flexCheckDefault" name="checkRemember" value="">
                    <label for="flexCheckDefault">Remember Me</label>
                </div>
                <button class="btn btn-outline-danger w-50" type="submit">
                    Log In
                </button>
            </form>
        </div>
    </body>
</html>
