<jsp:include page="common/header.jsp"/>

<div class="container-box">

    <h3 class="mb-3">Attendance Records</h3>

    <c:if test="${empty attendanceList}">
        <div class="alert alert-warning">No records found!</div>
    </c:if>

    <c:if test="${not empty attendanceList}">
        <table class="table table-bordered table-striped">
            <thead class="table-primary">
            <tr>
                <th>Date</th>
                <th>Status</th>
                <th>Faculty</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="at" items="${attendanceList}">
                <tr>
                    <td>${at.date}</td>
                    <td>${at.status}</td>
                    <td>${at.faculty.name}</td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
    </c:if>

    <a href="${pageContext.request.contextPath}/faculty/dashboard"
       class="btn btn-secondary mt-3">Back</a>

</div>

<jsp:include page="common/footer.jsp"/>
