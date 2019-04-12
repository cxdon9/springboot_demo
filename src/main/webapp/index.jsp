<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<h2>${requestScope.list}</h2>
<table>
    <tr>
        <td>ID</td>
        <td>name</td>
        <td>pwd</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="list">
    <tr>
        <td>${list.usid}</td>
        <td>${list.uname}</td>
        <td>${list.pwd}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
