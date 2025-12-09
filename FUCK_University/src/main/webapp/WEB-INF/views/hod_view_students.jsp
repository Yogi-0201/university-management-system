<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All Students</title>
</head>

<body>

<h2>Student List</h2>

<p style="color:green">${msg}</p>

<table border="1" cellpadding="7">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Dept</th>
        <th>Semester</th>
        <th>Action</th>
    </tr>

    <c:forEach var="st" items="${students}">
        <tr>
            <td>${st.id}</td>
            <td>${st.name}</td>
            <td>${st.email}</td>
            <td>${st.deptartment}</td>
            <td>${st.semester}</td>
            <td>
                <a href="deleteStudent?id=${st.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
