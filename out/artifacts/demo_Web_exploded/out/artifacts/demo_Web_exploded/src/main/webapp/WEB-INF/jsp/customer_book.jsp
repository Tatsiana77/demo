<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2> Incoming</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>


        </tr>
        <c:forEach var="customer" items="${customer.getBooksDto}">
            <tr>
                <td><c:out value="${customer.id}" /></td>
                <td><c:out value="${customer.name}" /></td>
                <td><c:out value="${customer.customer_address}" /></td>
                <td><c:out value="${customer.customer_phone}" /></td>
                <td><c:out value="${customer.customer_emai}" /></td>
                <td><button>Save</button></td>


            </tr>
        </c:forEach></table>

    </table>
</div>

</body>
</html>
