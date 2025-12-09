<jsp:include page="common/header.jsp"/>

<div class="container-box">

    <h3>Your Profile</h3>
    <hr>

    <p><strong>Name:</strong> ${student.name}</p>
    <p><strong>Email:</strong> ${student.email}</p>
    <p><strong>Department:</strong> ${student.deptartment}</p>
    <p><strong>Semester:</strong> ${student.semester}</p>

    <a href="${pageContext.request.contextPath}/student/editProfile"
       class="btn btn-warning w-100 mt-3">Edit Profile</a>

</div>

<jsp:include page="common/footer.jsp"/>
