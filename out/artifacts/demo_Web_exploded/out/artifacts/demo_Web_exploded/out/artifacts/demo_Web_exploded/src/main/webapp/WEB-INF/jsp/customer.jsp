<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of  Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Customer_address</th>
            <th>Customer_phone</th>
            <th>Customer_email</th>
        </tr>
        <table>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td><c:out value="${customer.id}" /></td>
                    <td><c:out value="${customer.name}" /></td>
                    <td><c:out value="${customer.surname}" /></td>
                    <td><c:out value="${customer.customer_address}" /></td>
                    <td><c:out value="${customer.customer_phone}" /></td>
                    <td><c:out value="${customer.customer_email}" /></td>
                </tr>
            </c:forEach></table>

    </table>
</div>

</body>
</html>
