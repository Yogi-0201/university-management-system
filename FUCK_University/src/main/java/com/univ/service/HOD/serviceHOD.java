package com.univ.service.HOD;

import java.util.List;

import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;

public interface serviceHOD {
	boolean registerStudent(studentEntity student);
	boolean registerFaculty(facultyEntity faculty);
	boolean updateStudent(studentEntity student);
	boolean updateFaculty(facultyEntity faculty);
	boolean deleteStudent(int id);
	boolean deleteFaculty(int id);
	List<studentEntity> getAllStudents();
	List<facultyEntity> getAllFaculty();
}
