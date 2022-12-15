<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>index42</title>
</head>
<body>
<c:forEach begin="${2}" end="${10}" step="${2}" var="counter">
  <p>${counter}</p>
</c:forEach>
</body>
</html>
