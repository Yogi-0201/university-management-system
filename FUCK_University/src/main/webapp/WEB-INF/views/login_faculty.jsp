<jsp:include page="common/header.jsp"/>

<div class="container-box">

    <h3 class="mb-3">Faculty Login</h3>

    <c:if test="${not empty msg}">
        <div class="alert alert-danger">${msg}</div>
    </c:if>

    <form action="${pageContext.request.contextPath}/faculty/login" method="post">

        <div class="mb-3">
            <label>Email</label>
            <input type="email" name="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="pass" class="form-control" required>
        </div>

        <button class="btn btn-primary w-100">Login</button>

    </form>

</div>

<jsp:include page="common/footer.jsp"/>
