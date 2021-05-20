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
            <th>Count</th>
            <th>Price</th>
            <th>Action</th>

        </tr>
        <c:forEach var="incoming" items="${book.getIncoming()}">
            <tr>
                <td><c:out value="${incoming.id}" /></td>
                <td><c:out value="${incoming.count_Incom}" /></td>
                <td><c:out value="${incoming.price}" /></td>
                <td><button>Save</button></td>


            </tr>
        </c:forEach></table>

    </table>
</div>

</body>
</html>
