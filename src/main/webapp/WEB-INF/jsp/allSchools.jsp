<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Schools</title>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <tbody>
    <c:forEach items="${allSchools}" var="school">
        <h3>${school.name}</h3>
        <table>
            <tr>
                <th>Student name</th>
            </tr>
            <c:forEach items="${school.students}" var="student">
                <tr>
                    <td>${student.name}</td>
                </tr>
            </c:forEach>
        </table>
        <br/>
    </c:forEach>

    </tbody>
</table>

<script type="text/javascript" src="<c:url value="/static/script/common.js"/>"></script>
</body>

<footer>
    <p id="footer-text">Bran Ioana-Andreea - CreateQ</p>
</footer>
</html>