package com.univ.dao.attendence;

import java.util.Date;
import java.util.List;

import com.univ.entity.attendenceEntity;

public interface AttendenceDAO {
	 boolean saveAttendance(attendenceEntity attendance);

	    boolean updateAttendance(attendenceEntity attendance);

	    attendenceEntity getAttendanceById(int id);

	    List<attendenceEntity> getAttendanceByStudentId(int studentId);

	    attendenceEntity getAttendanceByStudentAndDate(int studentId, Date date);

	    List<attendenceEntity> getAllAttendance();
}
