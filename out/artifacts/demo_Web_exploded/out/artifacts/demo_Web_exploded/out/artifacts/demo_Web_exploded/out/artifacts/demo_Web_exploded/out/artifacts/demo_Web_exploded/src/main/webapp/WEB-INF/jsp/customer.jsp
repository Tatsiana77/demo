<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding=25>
        <caption><h2>List of  Customers</h2></caption>
        <form method="get" action="search">
            <input type="text" name="keyword" />
            <input type="submit" value="Search" />
        </form>
        <h3><a href="/new">New Customer</a></h3>
        <table border="1" cellpadding="5">
            <tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Customer_address</th>
            <th>Customer_phone</th>
            <th>Customer_email</th>
            <th>Books</th>
            <th>Orders</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td><c:out value="${customer.id}" /></td>
                    <td><c:out value="${customer.name}" /></td>
                    <td><c:out value="${customer.surname}" /></td>
                    <td><c:out value="${customer.customer_address}" /></td>
                    <td><c:out value="${customer.customer_phone}" /></td>
                    <td><c:out value="${customer.customer_email}" /></td>
                    <td><button><a href="/customer/book?id=${customer.id}"> Book</a></button></td>
                    <td><button><a href="/customer/orders?id=${customer.id}"> Orders</a></button></td>
                    <td><button>   <a href="/edit?id=${customer.id}">Edit</a></button></td>
                    <td><button><a href="/delete?id=${customer.id}">Delete</a></button></td>

                </tr>
            </c:forEach>

    </table>
</div>

</body>
</html>
