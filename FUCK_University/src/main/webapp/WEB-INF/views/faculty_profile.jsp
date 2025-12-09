<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Faculty Profile</title>
</head>
<body>

<jsp:include page="common/navbar.jsp"/>

<h2>Your Profile</h2>

<jsp:useBean id="faculty" scope="request" class="com.univ.entity.facultyEntity"/>

<p><strong>Name:</strong> ${faculty.name}</p>
<p><strong>Email:</strong> ${faculty.email}</p>
<p><strong>Department:</strong> ${faculty.deptartment}</p>

<h3>Update Profile</h3>

<form action="${pageContext.request.contextPath}/faculty/update" method="post">

    <input type="hidden" name="id" value="${faculty.id}"/>

    <label>Name:</label>
    <input type="text" name="name" value="${faculty.name}" required><br><br>

    <label>Email:</label>
    <input type="email" name="email" value="${faculty.email}" required><br><br>

    <label>Password:</label>
    <input type="text" name="pass" value="${faculty.pass}" required><br><br>

    <label>Department:</label>
    <input type="text" name="department" value="${faculty.deptartment}" required><br><br>

    <button type="submit">Update</button>
</form>

<jsp:include page="common/footer.jsp"/>

</body>
</html>
