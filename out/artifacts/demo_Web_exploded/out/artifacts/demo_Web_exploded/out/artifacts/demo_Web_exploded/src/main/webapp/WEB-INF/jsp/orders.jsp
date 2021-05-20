<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Orders</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2>List of  Orders</h2></caption>
        <form method="get" action="search">
            <input type="text" name="keyword" />
            <input type="submit" value="Search" />
        </form>
        <h3><a href="<c:url value="/new "/>">New  Orders</a></h3>
        <table border="1" cellpadding="5">
            <tr>
            <tr>
                <th>ID</th>
                <th>Count</th>
                <th>Date</th>
                <th>Action</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>

            <c:forEach var="order" items="${orders}">
                <tr>
                    <td><c:out value="${order.id}" /></td>
                    <td><c:out value="${order.countOrders}" /></td>
                    <td><c:out value="${order.dateOfOrder}" /></td>
                    <td><button><a href="<c:url value="/orders/customer?id= ${order.id}"/>"> Customer</a></button></td>
                    <td><button>   <a href="<c:url value="orders/edit?id:${order.id}"/>">Edit</a></button></td>
                    <td><button><a href="<c:url value="/orders/{id}?id:${order.id}"/>">Delete</a></button></td>
                </tr>
            </c:forEach>

        </table>
</div>

</body>
</html>
