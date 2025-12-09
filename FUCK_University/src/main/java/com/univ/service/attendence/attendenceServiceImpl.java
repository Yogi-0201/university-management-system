package com.univ.service.attendence;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univ.dao.attendence.AttendenceDAO;
import com.univ.entity.attendenceEntity;


@Service
@Transactional
public class attendenceServiceImpl implements attendenceService {
	
	@Autowired
	private AttendenceDAO ado;
	@Override
	public boolean saveAttendance(attendenceEntity attendance) {
		
		return ado.saveAttendance(attendance);
	}

	@Override
	public boolean updateAttendance(attendenceEntity attendance) {
		
		return ado.updateAttendance(attendance);
	}

	@Override
	public attendenceEntity getAttendanceById(int id) {
		
		return ado.getAttendanceById(id);
	}

	@Override
	public List<attendenceEntity> getAttendanceByStudentId(int studentId) {
		
		return ado.getAttendanceByStudentId(studentId);
	}

	@Override
	public attendenceEntity getAttendanceByStudentAndDate(int studentId, Date date) {
		
		return ado.getAttendanceByStudentAndDate(studentId, date);
	}

	@Override
	public List<attendenceEntity> getAllAttendance() {
	
		return ado.getAllAttendance();
	}

}
