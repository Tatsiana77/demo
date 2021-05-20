<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Authors</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2>List of  Authors</h2></caption>
        <form method="get" action="search">
            <input type="text" name="keyword" />
            <input type="submit" value="Search" />
        </form>
        <h3><a href="<c:url value="/new "/>">New  Author</a></h3>
        <table border="1" cellpadding="5">
            <tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Action</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

            <c:forEach var="author" items="${authors}">
                <tr>
                    <td><c:out value="${author.id}" /></td>
                    <td><c:out value="${author.name}" /></td>
                    <td><c:out value="${author.surname}" /></td>
                    <td><button><a href="<c:url value="/author/book?id= ${author.id}"/>"> Book</a></button></td>
                    <td><button>   <a href="<c:url value="author/edit?id:${author.id}"/>">Edit</a></button></td>
                    <td><button><a href="<c:url value="/author/{id}?id:${author.id}"/>">Delete</a></button></td>
                </tr>
            </c:forEach>

    </table>
</div>

</body>
</html>
