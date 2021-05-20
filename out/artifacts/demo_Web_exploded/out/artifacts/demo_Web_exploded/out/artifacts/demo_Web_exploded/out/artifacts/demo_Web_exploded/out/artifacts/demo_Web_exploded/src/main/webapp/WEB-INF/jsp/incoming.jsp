<%--
  Created by IntelliJ IDEA.
  User: Work
  Date: 03.05.2021
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2>List of  Incoming</h2></caption>
        <tr>
            <th>ID</th>
            <th>count_Incom</th>
            <th>Price</th>
            <th>Action</th>

        </tr>

        <c:forEach var="incoming" items="${incoming}">
            <tr>
                <td><c:out value="${incoming.id}" /></td>
                <td><c:out value="${incoming.count_Incom}" /></td>
                <td><c:out value="${incoming.price}" /></td>

            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
