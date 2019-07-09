<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
<title>Tour Details</title>
<body>
<h1>Tour Details</h1>
Tour Details for ${tour.tourName}
<p>${tour.description}</p>
<p>Schedule:</p>
<c:forEach var="concert" items="${tour.concerts}">
    <table style="border: 1px black solid;">
        <tr>
            <th>Venue</th>
            <th></th>
            <th>Date</th>
            <th>Days Until</th>
        </tr>
        <tr>
            <td>${concert.venue}</td>
            <td>${concert.type}</td>
            <td><fmt:formatDate pattern="dd MMM yyyy" value="${concert.date}"/></td>
            <td>${concert.countDown}</td>
        </tr>
    </table>
    <h3>User ratings</h3>
    <table style="border: 1px black solid;">
        <tr>
            <th>rating</th>
            <th>comment</th>
        </tr>
        <c:forEach var="userRaiting" items="${concert.userRatings}">

            <tr>
                <th>${userRaiting.rating == null ? defaultValue : userRaiting.rating}</th>
                <th>${userRaiting.comment == null ? defaultValue: userRaiting.comment}</th>
            </tr>
        </c:forEach>
    </table>
    <br><br>
</c:forEach>
<a href="../bands">Back to Band List</a>
</body>
</html>