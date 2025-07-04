<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Students</title>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allStudent}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script type="text/javascript" src="<c:url value="/static/script/common.js"/>"></script>
</body>

<footer>
    <p id="footer-text">Bran Ioana-Andreea - CreateQ</p>
</footer>
</html>