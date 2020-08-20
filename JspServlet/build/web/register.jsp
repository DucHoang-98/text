<%-- 
    Document   : Update
    Created on : Jun 23, 2020, 1:51:39 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container pt-4">
             <form action="InsertServlet" method="post">
                <table class="table table-dark table-hover">
                    <input type="text" name="id" value="${student.id}" />
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="fullname" value="${student.fullname}"/></td>
                    </tr>
                    <tr>
                        <td>quantity</td>
                        <td><input type="text" name="phone" value="${student.phone}"/></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="avg" value="${student.avg_mark}"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
