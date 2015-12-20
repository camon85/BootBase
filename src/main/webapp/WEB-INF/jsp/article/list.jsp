<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>articles</title>
</head>
<body>
 <c:forEach var="article" items="${articles }">
    <div>${article.content}</div>
 </c:forEach>
</body>
</html>
