<%--
  Created by IntelliJ IDEA.
  User: admin1
  Date: 6/26/19
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1><td>${customerDetails.name}</td></h1>
    <table>
        <tr>
            <td>${customerDetails.code}</td>
            <td>${customerDetails.name}</td>
            <td>${customerDetails.uid}</td>
        </tr>
    </table>
<h2>Sport count: <td>${customerDetails.sportCount}</td></h2>
<a href="../customers">Back to all customers</a>
</body>
</html>
