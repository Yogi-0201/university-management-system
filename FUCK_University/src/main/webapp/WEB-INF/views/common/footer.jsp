<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</div> <!-- /.container or /.container-fluid (closed here) -->

<!-- Optional: a small site map / quick links row above footer -->
<footer class="bg-light mt-5">
    <div class="container py-4">
        <div class="row">
            <div class="col-md-4 mb-3">
                <h6 class="text-uppercase fw-bold">University Management</h6>
                <p class="small text-muted mb-0">Manage students, faculty and attendance with a clean MVC + Hibernate setup.</p>
            </div>

            <div class="col-md-4 mb-3">
                <h6 class="text-uppercase fw-bold">Quick Links</h6>
                <ul class="list-unstyled">
                    <li><a class="text-decoration-none" href="${pageContext.request.contextPath}/">Home</a></li>
                    <li><a class="text-decoration-none" href="${pageContext.request.contextPath}/student/login">Student Login</a></li>
                    <li><a class="text-decoration-none" href="${pageContext.request.contextPath}/faculty/login">Faculty Login</a></li>
                    <li><a class="text-decoration-none" href="${pageContext.request.contextPath}/hod/login">HOD Login</a></li>
                </ul>
            </div>

            <div class="col-md-4 mb-3">
                <h6 class="text-uppercase fw-bold">Contact</h6>
                <p class="small text-muted mb-1">Email: support@university.example</p>
                <p class="small text-muted mb-0">Phone: +91 98765 43210</p>
            </div>
        </div>

        <hr class="my-3" />

        <div class="row">
            <div class="col text-center">
                <p class="small text-muted mb-0">© 2025 University Management System</p>
            </div>
        </div>
    </div>
</footer>

<!-- BOOTSTRAP JS (Bundle includes Popper) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="" crossorigin="anonymous"></script>

<!-- Optional: place for your custom scripts -->
<script>
    // Example: auto-hide flash messages after 4s (flash messages stored in a div with id 'flashMsg')
    (function() {
        const flash = document.getElementById('flashMsg');
        if (flash) {
            setTimeout(() => { flash.style.display = 'none'; }, 4000);
        }
    })();
</script>

</body>
</html>
