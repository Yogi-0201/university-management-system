package com.univ.service.faculty;

import java.util.List;

import com.univ.entity.attendenceEntity;
import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;

public interface facultyService {
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
