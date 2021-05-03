<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of  Author</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Action</th>
        </tr>
        <table>
            <c:forEach var="author" items="${authors}">
                <tr>
                    <td><c:out value="${author.id}" /></td>
                    <td><c:out value="${author.name}" /></td>
                    <td><c:out value="${author.surname}" /></td>
                </tr>
            </c:forEach></table>

    </table>
</div>

</body>
</html>
