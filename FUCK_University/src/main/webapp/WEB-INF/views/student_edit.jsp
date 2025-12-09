<jsp:include page="common/header.jsp"/>

<div class="container-box">

    <h3>Edit Profile</h3>
    <hr>

    <form action="${pageContext.request.contextPath}/student/update" method="post">

        <input type="hidden" name="id" value="${student.id}" />

        <div class="mb-3">
            <label>Name</label>
            <input name="name" class="form-control" value="${student.name}">
        </div>

        <div class="mb-3">
            <label>Email</label>
            <input name="email" class="form-control" value="${student.email}">
        </div>

        <div class="mb-3">
            <label>Password</label>
            <input name="pass" class="form-control" value="${student.pass}">
        </div>

        <div class="mb-3">
            <label>Department</label>
            <input name="deptartment" class="form-control" value="${student.deptartment}">
        </div>

        <div class="mb-3">
            <label>Semester</label>
            <input name="semester" class="form-control" value="${student.semester}">
        </div>

        <button class="btn btn-success w-100">Update</button>

    </form>

</div>

<jsp:include page="common/footer.jsp"/>
