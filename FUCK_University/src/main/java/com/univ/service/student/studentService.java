package com.univ.service.student;

import com.univ.entity.studentEntity;

public interface studentService {
	boolean register(studentEntity student);
	studentEntity login(String email, String pass);
	studentEntity getStudentById(int id);
	boolean updateStudent(studentEntity student);
}
