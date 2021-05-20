<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;  charset=UTF-8" language="java" %>

<html>
<head>
    <title> New Authors</title>
</head>
<body>
<div align="center">
    <h2>New  Author</h2>
    <form:form action="save" method="post" >
        <modelAttribute>author</modelAttribute>
        <table border="0" cellpadding="5">
            <tr>
                <td>Name: </td>
                <td>
                    <form:input path="name" /></td>
            </tr>
            <td>Surname :</td>
            <td><form:input path="surname" /></td>
            <tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
