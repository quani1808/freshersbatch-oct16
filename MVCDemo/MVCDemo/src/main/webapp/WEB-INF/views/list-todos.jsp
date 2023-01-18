<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
your todos are
${todos}</br>
<c:forEach items="${todos}" var="todo">

${todo.id} ${todo.desc} ${todo.user} ${targetDate}</br>

</c:forEach>
<a class="button" href="/spring-mvc/add-todo">Add</a>
</body>
</html>