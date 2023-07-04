<%--
  Created by IntelliJ IDEA.
  User: Oh
  Date: 2023-07-03
  Time: 오후 6:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Todo List</h1>

    <ol>
        <li><input type="checkbox" name="todolist" value="Java study"> Java study</li>
        <li><input type="checkbox" name="todolist" value="Eating"> Eating</li>
        <li><input type="checkbox" name="todolist" value="Read a book"> Read a book</li>
        <li><input type="checkbox" name="todolist" value="Watch a movie"> Watch a movie</li>
        <li><input type="checkbox" name="todolist" value="Meet friends"> Meet friends</li>
        <li><input type="checkbox" name="todolist" value="Buy a pen"> Buy a pen</li>

    </ol>
    <br>
    <p><button type="submit">Add</button></p>
    <p><button type="button">Modify / Delite</button></p>

<%--    <ul>--%>
<%--        <c:forEach var="dto" items="${list}">--%>
<%--            <li>${dto}</li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>


</body>
</html>
