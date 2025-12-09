<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOD Login</title>
</head>
<body>

<h2>HOD Login</h2>

<form action="login" method="post">
    <p>Email: <input type="text" name="email" required></p>
    <p>Password: <input type="password" name="pass" required></p>
    <button type="submit">Login</button>
</form>

<p style="color:red">${msg}</p>

</body>
</html>
