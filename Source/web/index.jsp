<%-- 
    Document   : index
    Created on : Apr 10, 2016, 10:34:26 PM
    Author     : HongLinh
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
        <h1>Hello World!</h1>
        <c:forEach var="stu" items="${LISTLAP}" varStatus="counter">
            ${counter.count}. ${stu.name} <br/>
        </c:forEach>
    </body>
</html>
