<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Orders</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2> Orders</h2></caption>

        <tr>
            <th>ID</th>
            <th>Count</th>
            <th>Date</th>
        </tr>
        <c:forEach var="orders" items="${book.getOrdersDto()}">
            <tr>
                <td><c:out value="${orders.id}"/></td>
                <td><c:out value="${orders.countOrder}"/></td>
                <td><c:out value="${orders. dateOfOrder}"/></td>
            <tr>
            </tr>
        </c:forEach></table>
    <div align="center">
        <tr>  <table border="1" cellpadding="20">
            <td>  <button>Save</button>
            </td>
            </tr>
        </table>
    </div>
</div>

</body>
</html>
