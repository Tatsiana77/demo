<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="20">
        <caption><h2> Books</h2></caption>

        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Action</th>
        </tr>
        <c:forEach var="book" items="${author.getBookDto()}">
            <tr>
                <td><c:out value="${book.id}"/></td>
                <td><c:out value="${book.title}"/></td>
                <td>
                    <button><a href="/book/incomings?id=${book.id}"></a> Incoming</button>
                    <c:forEach var = "incoming" items="${book.getIncomingDto()}">
                        <td><c:out value="${incoming.id}"/> </td>
                        <td><c:out value="${incoming.count_Incomncoming.id}"/> </td>
                        <td><c:out value="${incoming.price}"/> </td>
                    </c:forEach>
                </td>
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