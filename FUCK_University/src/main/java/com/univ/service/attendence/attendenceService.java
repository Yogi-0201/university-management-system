package com.univ.service.attendence;

import java.util.Date;
import java.util.List;

import com.univ.entity.attendenceEntity;

public interface attendenceService {
	boolean saveAttendance(attendenceEntity attendance);

    boolean updateAttendance(attendenceEntity attendance);

    attendenceEntity getAttendanceById(int id);

    List<attendenceEntity> getAttendanceByStudentId(int studentId);

    attendenceEntity getAttendanceByStudentAndDate(int studentId, Date date);

    List<attendenceEntity> getAllAttendance();
}
