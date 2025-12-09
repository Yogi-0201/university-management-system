University Management System (Spring MVC + Hibernate + JSP)

A role-based university management application built using Spring MVC, Spring ORM (Hibernate), JSP, and MySQL.
This project manages Students, Faculty, and HOD, including registration, login, attendance management, and profile updates.

🚀 Features:
👨‍🎓 Student Module

        Student Registration & Login
        View Profile / Edit Profile
        Dashboard for Students

👨‍🏫 Faculty Module

        Faculty Login
        
        Mark Attendance for Students (Present/Absent buttons)
        View Attendance Records of Any Student
        Update Faculty Profile
        Secure session-based access

🏢 HOD Module

        HOD Login
        Add/View/Delete Students
        Add/View/Delete Faculty
        View attendance reports
        Full administrative control

🛠️ Technology Stack
    Backend
    
        Spring MVC – Controller layer & request handling
        Spring ORM (Hibernate) – DAO layer & database operations
        Hibernate – Entity mapping, HQL queries        
        MySQL – Database
        JSP + JSTL – View layer
        Servlet + JSP Container (Tomcat)

📂 Project Architecture (Layered MVC)
src/main/java
 └── com.univ
      ├── controller
      ├── service
      │     ├── student
      │     ├── faculty
      │     ├── HOD
      │     └── attendance
      ├── dao
      ├── entity
      └── util

⭐ Key Highlights

      Fully structured MVC + Service + DAO architecture
      Hibernate ORM with entity relationships & annotations
      Session-based authentication for all roles
      Attendance mapped with Many-To-One (student ↔ faculty)
      Clean and scalable folder structure
      Bootstrap UI for responsive pages

🖥️ Pages Included
Student

    reg_student.jsp
    student_login.jsp
    student_dashboard.jsp
    student_profile.jsp
    student_edit.jsp

Faculty

    login_faculty.jsp
    faculty_dashboard.jsp
    mark_attendance.jsp
    faculty_view_attendance.jsp
    faculty_profile.jsp

HOD

    hod_login.jsp
    hod_dashboard.jsp
    hod_view_students.jsp
    hod_view_faculty.jsp
    hod_add_student.jsp
    hod_add_faculty.jsp

Common

    header.jsp
    footer.jsp
    navbar.jsp

⚙️ How to Run

    Import project into Eclipse
    Configure Tomcat Server
    Create database in MySQL:
    create database university;
    Update DB credentials in applicationContext.xml
    Run on server → visit:
    http://localhost:8080/FUCK_University/

📌 Future Enhancements

    Password hashing
    Department-wise attendance filtering
    Pagination in HOD student view
    REST API version

👤 Author

    Yogendra Singh
    MCA – AI & Data Science
