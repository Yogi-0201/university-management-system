package com.univ.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univ.dao.student.studentDAO;
import com.univ.entity.studentEntity;

@Service
@Transactional
public class studentServiceImpl implements studentService{
	@Autowired
	private studentDAO std;
	@Override
	public boolean register(studentEntity student) {
		
		return std.register(student);
	}

	@Override
	public studentEntity login(String email, String pass) {
		
		return std.login(email, pass);
	}

	@Override
	public studentEntity getStudentById(int id) {
		
		return std.getStudentById(id);
	}

	@Override
	public boolean updateStudent(studentEntity student) {
		
		return std.updateStudent(student);
	}

}
