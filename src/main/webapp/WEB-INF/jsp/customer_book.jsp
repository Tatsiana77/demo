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
            <th>Title</th>
            <th>Action</th>



        </tr>
        <c:forEach var="book" items="${customer.getBooksDto()}">
            <tr>
                <td><c:out value="${book.id}" /></td>
                <td><c:out value="${book.title}" /></td>
                <td><button>Save</button></td>


            </tr>
        </c:forEach></table>

    </table>
</div>

</body>
</html>
