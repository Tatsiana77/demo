<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2> Book</h2></caption>
        <tr>
            <th>ID</th>
            <th>Count</th>
            <th>Date</th>
            <th>Action</th>

        </tr>
        <c:forEach var="orders" items="${customer.getOrderDto() }">
            <tr>
                <td><c:out value="${orders.id}" /></td>
                <td><c:out value="${orders.countOrders}" /></td>
                <td><c:out value="${orders.dateOfOrder}" /></td>


            </tr>
        </c:forEach></table>
    <tr>
        <td>
            <button>Save</button></td></tr>
    </table>
</div>

</body>
</html>
