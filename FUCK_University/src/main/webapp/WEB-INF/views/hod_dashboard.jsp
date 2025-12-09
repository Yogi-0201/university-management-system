<jsp:include page="common/navbar.jsp"/>

<div class="container">
    <h2>Welcome HOD</h2>

    <div class="card">
        <ul>
            <li><a href="${pageContext.request.contextPath}/hod/students">View Students</a></li>
            <li><a href="${pageContext.request.contextPath}/hod/faculty">View Faculty</a></li>
            <li><a href="${pageContext.request.contextPath}/hod/addStudent">Add Student</a></li>
            <li><a href="${pageContext.request.contextPath}/hod/addFaculty">Add Faculty</a></li>
            <li><a href="${pageContext.request.contextPath}/hod/logout">Logout</a></li>
        </ul>
    </div>
</div>

<jsp:include page="common/footer.jsp"/>
