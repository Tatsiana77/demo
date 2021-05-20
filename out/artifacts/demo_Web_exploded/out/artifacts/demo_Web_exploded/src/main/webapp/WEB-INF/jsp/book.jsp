<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div align="center">
    <table border="3" cellpadding="15">
        <caption><h2>List of  Books</h2></caption>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Incoming</th>
            <th>Orders</th>
            <th>Edit</th>
            <th>Delete</th>

        </tr>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.id}" /></td>
                    <td><c:out value="${book.title}" /></td>
                    <td><button><a href="<c:url value="/book/incoming?id= ${book.id}"/>"> Incoming</a></button></td>
                    <td><button><a href="<c:url value="/book/order?id= ${book.id}"/>">Orders</a></button></td>
                    <td><button>   <a href="<c:url value="book/edit?id:${book.id}"/>">Edit</a></button></td>
                    <td><button><a href="<c:url value="/book/{id}?id:${book.id}"/>">Delete</a></button></td>
                </tr>
            </c:forEach></table>
    <td>
    <td><button>Save</button></td>
    </td>

    </table>
</div>

</body>
</html>
