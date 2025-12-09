package com.univ.service.faculty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univ.dao.faculty.FacultyDAO;
import com.univ.entity.attendenceEntity;
import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;
@Service
@Transactional
public class facultyServiceImpl implements facultyService {
	@Autowired
	private FacultyDAO fcd;;
	
	@Override
	public facultyEntity login(String email, String pass) {
		
		return fcd.login(email, pass);
	}

	@Override
	public boolean updateFaculty(facultyEntity faculty) {
		
		return fcd.updateFaculty(faculty);
	}

	@Override
	public facultyEntity getFacultyById(int id) {

		return fcd.getFacultyById(id);
	}

	@Override
	public studentEntity getStudentById(int id) {
		
		return fcd.getStudentById(id);
	}

	@Override
	public boolean markAttendance(attendenceEntity attendance) {
		
		return fcd.markAttendance(attendance);
	}

	@Override
	public List<attendenceEntity> getAttendanceByStudentId(int studentId) {
		
		return fcd.getAttendanceByStudentId(studentId);
	}
	
	

	@Override
	public List<studentEntity> getAllStudentsForAttendance() {
	    return fcd.getAllStudentsForAttendance();
	}

	@Override
	public List<studentEntity> getStudentsByDept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}



}
