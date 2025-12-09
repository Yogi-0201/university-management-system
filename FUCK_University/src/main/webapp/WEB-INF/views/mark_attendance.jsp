<jsp:include page="common/header.jsp"/>

<div class="container-box">

    <h3 class="mb-3">Mark Attendance</h3>

    <p><strong>Faculty:</strong> ${faculty.name}</p>
    <p><strong>Department:</strong> ${faculty.deptartment}</p>

    <table class="table table-bordered table-striped mt-3">
        <thead class="table-primary">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Semester</th>
            <th>Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="st" items="${students}">
            <tr>
                <td>${st.id}</td>
                <td>${st.name}</td>
                <td>${st.semester}</td>

                <td>
                    <form action="${pageContext.request.contextPath}/faculty/saveAttendance"
                          method="post" style="display:inline-block;">
                        <input type="hidden" name="studentId" value="${st.id}">
                        <input type="hidden" name="facultyId" value="${faculty.id}">
                        <input type="hidden" name="status" value="Present">
                        <button class="btn btn-success btn-sm">Present</button>
                    </form>

                    <form action="${pageContext.request.contextPath}/faculty/saveAttendance"
                          method="post" style="display:inline-block;">
                        <input type="hidden" name="studentId" value="${st.id}">
                        <input type="hidden" name="facultyId" value="${faculty.id}">
                        <input type="hidden" name="status" value="Absent">
                        <button class="btn btn-danger btn-sm">Absent</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</div>

<jsp:include page="common/footer.jsp"/>
