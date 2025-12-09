<jsp:include page="common/header.jsp"/>

<div class="container-box">

    <h3 class="mb-4">Student Registration</h3>

    <c:if test="${not empty msg}">
        <div class="alert alert-info">${msg}</div>
    </c:if>

    <form action="${pageContext.request.contextPath}/student/registerStudent" method="post">

        <div class="mb-3">
            <label>Name</label>
            <input type="text" name="name" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Email</label>
            <input type="email" name="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="pass" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Department</label>
            <input type="text" name="deptartment" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Semester</label>
            <input type="text" name="semester" class="form-control" required>
        </div>

        <button class="btn btn-primary w-100">Register</button>
    </form>

</div>

<jsp:include page="common/footer.jsp"/>
