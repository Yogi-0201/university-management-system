package com.univ.service.HOD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univ.dao.HOD.hodDAO;
import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;

@Service
@Transactional
public class serviceHODImple implements serviceHOD{
	@Autowired
	private hodDAO hdo;
	
	@Override
	public boolean registerStudent(studentEntity student) {
		
		return hdo.registerStudent(student);
	}

	@Override
	public boolean registerFaculty(facultyEntity faculty) {
		
		return hdo.registerFaculty(faculty);
	}

	@Override
	public boolean updateStudent(studentEntity student) {
		
		return hdo.updateStudent(student);
	}

	@Override
	public boolean updateFaculty(facultyEntity faculty) {
		
		return hdo.updateFaculty(faculty);
	}

	@Override
	public boolean deleteStudent(int id) {
		
		return hdo.deleteStudent(id);
	}

	@Override
	public boolean deleteFaculty(int id) {
		
		return hdo.deleteFaculty(id);
	}

	@Override
	public List<studentEntity> getAllStudents() {
		
		return hdo.getAllStudents();
	}

	@Override
	public List<facultyEntity> getAllFaculty() {
		
		return hdo.getAllFaculty();
	}

}
