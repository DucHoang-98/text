<%-- 
    Document   : index
    Created on : Jun 24, 2020, 9:10:44 AM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Search form -->

        <div class="container pt-4 " >
            <form action="DisplayServlet" method="post"class="form-inline d-flex justify-content-center md-form form-sm active-pink active-pink-2 mt-2">
                <i class="fas fa-search" aria-hidden="true"></i>
                <input class="form-control form-control-sm ml-3 w-75" type="text" placeholder="Search"
                       aria-label="Search" name="searchName">
                <input type="submit" value="Search"/>
                <button ><a href="register.jsp">Add Student</a></button>
            </form>

            <table class="table table-dark table-hover ">
                <tr>
                    <th>ID</th>
                    <th>FullName</th>
                    <th>Phone</th>
                    <th>AVG</th>  
                </tr>
                <c:forEach var="student" items="${listStudent}">
                    <tr>
                        <th>${student.id}</th>
                        <th>${student.fullname}</th>
                        <th>${student.phone}</th>
                        <th>${student.avg_mark}</th>
                        <th><a href="DeleteServlet?id=${student.id}">Delete</a></th>
                        <th><a href="UpdateServlet?id=${student.id}">Edit</a></th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
