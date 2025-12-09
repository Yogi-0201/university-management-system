<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All Faculty</title>
</head>

<body>

<h2>Faculty List</h2>

<p style="color:green">${msg}</p>

<table border="1" cellpadding="7">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Dept</th>
        <th>Action</th>
    </tr>

    <c:forEach var="fc" items="${facultyList}">
        <tr>
            <td>${fc.id}</td>
            <td>${fc.name}</td>
            <td>${fc.email}</td>
            <td>${fc.deptartment}</td>
            <td>
                <a href="deleteFaculty?id=${fc.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
