package com.univ.dao.faculty;

import java.util.List;

import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;
import com.univ.entity.attendenceEntity;

public interface FacultyDAO {


    facultyEntity login(String email, String pass);

    boolean updateFaculty(facultyEntity faculty);

    facultyEntity getFacultyById(int id);

    // Faculty can view student details
    studentEntity getStudentById(int id);

    // Faculty marking attendance
    boolean markAttendance(attendenceEntity attendance);

    // Faculty viewing attendance
    List<attendenceEntity> getAttendanceByStudentId(int studentId);
    List<studentEntity> getStudentsByDept(String dept);
    
    List<studentEntity> getAllStudentsForAttendance();


}
