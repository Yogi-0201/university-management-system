<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Student</title>
</head>

<body>

<h2>Add Student</h2>

<p style="color:green">${msg}</p>

<form action="addStudent" method="post">

    <p>Name: <input type="text" name="name" required></p>
    <p>Email: <input type="email" name="email" required></p>
    <p>Password: <input type="password" name="pass" required></p>
    <p>Department: <input type="text" name="deptartment" required></p>
    <p>Semester: <input type="text" name="semester" required></p>

    <button type="submit">Add Student</button>

</form>

</body>
</html>
