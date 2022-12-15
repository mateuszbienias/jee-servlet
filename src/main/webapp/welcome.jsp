<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 15.12.2022
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/servlet312" method="post">
  <label for="language">Wybierz język:</label>
  <select name="language" id="language">
    <option value="en">Hello</option>
    <option value="pl">Cześć</option>
    <option value="de">Hallo</option>
    <option value="es">Hola</option>
    <option value="fr">Salut</option>
  </select>
  <input type="submit" value="Wyślij">
</form>
</body>
</html>
