<jsp:include page="common/header.jsp"/>

<div class="container-box text-center">
    <h3>Welcome, ${studentData.name}</h3>

    <hr>

    <a href="${pageContext.request.contextPath}/student/profile" class="btn btn-info w-100 mb-2">View Profile</a>
    <a href="${pageContext.request.contextPath}/student/editProfile" class="btn btn-warning w-100 mb-2">Edit Profile</a>
    <a href="${pageContext.request.contextPath}/student/logout" class="btn btn-danger w-100">Logout</a>
</div>

<jsp:include page="common/footer.jsp"/>
