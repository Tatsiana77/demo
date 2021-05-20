<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Publishers</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2>List of  Publishers</h2></caption>
        <form method="get" action="search">
            <input type="text" name="keyword" />
            <input type="submit" value="Search" />
        </form>
        <h3><a href="<c:url value="/new "/>">New  Publisher</a></h3>
        <table border="1" cellpadding="5">
            <tr>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Year</th>
                <th>Action</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>

            <c:forEach var="publisher" items="${publishers}">
                <tr>
                    <td><c:out value="${publisher.id}" /></td>
                    <td><c:out value="${publisher.name}" /></td>
                    <td><c:out value="${publisher.publisher_Address}" /></td>
                    <td><c:out value="${publisher.yearOfPub}" /></td>
                    <td><button><a href="<c:url value="/publisher/book?id= ${publisher.id}"/>"> Book</a></button></td>
                    <td><button>   <a href="<c:url value="publisher/edit?id:${publisher.id}"/>">Edit</a></button></td>
                    <td><button><a href="<c:url value="/publisher/{id}?id:${publisher.id}"/>">Delete</a></button></td>
                </tr>
            </c:forEach>

            <form method="get" action="search">
                <input type="text" name="keyword" />
                <input type="submit" value="Save" />
            </form>

        </table>
</div>

</body>
</html>
