<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="date" uri="http://java.sun.com/jsp/jstl/datetld" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>

<p>

<c:forEach var="style" items="${styles}" >
    <br>try: ${style}
    </c:forEach>

<p>Color and Font Size <date:currentDateTime color="red" fontSize="20px"></date:currentDateTime> </p>
<p>Color Only <date:currentDateTime color="red"  ></date:currentDateTime> </p>
<p>Font Size Only - <date:currentDateTime  fontSize="20px"></date:currentDateTime> </p>
<p>No Attributes -<date:currentDateTime ></date:currentDateTime> </p>
</body>
</html>