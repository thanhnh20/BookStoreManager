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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginController" method="POST">
            <c:set var="error" value="${requestScope.ERROR}"/>
            <c:if test="${not empty error}">
                <font color="red">
                    ${error.wrongAccount}  
                </font>               
            </c:if><br/>
            Username <input type="text" name="txtUsername" value="" /><br/>
            <c:if test="${not empty error}">
                <font color="red">
                    ${error.usernameEmpty}  
                </font>               
            </c:if><br/>
            Password <input type="password" name="txtPassword" value="" /><br/>
            <c:if test="${not empty error}">
                <font color="red">
                    ${error.passwordEmpty}  
                </font>               
            </c:if><br/>
            <input type="submit" value="Login" />
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>
