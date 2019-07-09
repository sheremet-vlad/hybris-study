<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin1
  Date: 6/26/19
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<table style="border: black solid 1px">
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.code}</td>
            <td><a href="./customers/${customer.code}">${customer.name}</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
