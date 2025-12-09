<jsp:include page="common/header.jsp"/>

<div class="container-box text-center">

    <h3>Welcome, ${facultyData.name}</h3>

    <hr>

    <a href="${pageContext.request.contextPath}/faculty/profile" class="btn btn-info w-100 mb-2">
        View Profile
    </a>

    <a href="${pageContext.request.contextPath}/faculty/attendance" class="btn btn-primary w-100 mb-2">
        Mark Attendance
    </a>

    <a href="${pageContext.request.contextPath}/faculty/logout" class="btn btn-danger w-100">
        Logout
    </a>

</div>

<jsp:include page="common/footer.jsp"/>
