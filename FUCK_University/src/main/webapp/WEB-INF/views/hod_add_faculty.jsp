<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Add Faculty</title>
</head>

<body>

<h2>Add Faculty</h2>

<p style="color:green">${msg}</p>

<form action="addFaculty" method="post">

    <p>Name: <input type="text" name="name" required></p>
    <p>Email: <input type="email" name="email" required></p>
    <p>Password: <input type="password" name="pass" required></p>
    <p>Department: <input type="text" name="deptartment" required></p>

    <button type="submit">Add Faculty</button>

</form>

</body>
</html>
