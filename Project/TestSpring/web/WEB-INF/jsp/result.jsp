<%-- 
    Document   : result
    Created on : Aug 4, 2018, 11:38:33 AM
    Author     : minusbug
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
                <tr>
                    <td><form:label path="name">name</form:label></td>
                    <td>${name}</td>
                    
                </tr>
                 <tr>
                    <td><form:label path="age">Age</form:label></td>
                    <td>${age}</td>
                    
                </tr>
                
                    
            </table>
    </body>
</html>
