package com.univ.dao.attendence;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.univ.entity.attendenceEntity;
import com.univ.entity.facultyEntity;

@Repository
@Transactional
public class AttendenceDAOImpl implements AttendenceDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public boolean saveAttendance(attendenceEntity attendance) {
		try {
			getSession().save(attendance);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateAttendance(attendenceEntity attendance) {
		try {
			getSession().merge(attendance);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public attendenceEntity getAttendanceById(int id) {
		return getSession().get(attendenceEntity.class, id);
	}

	@Override
	public List<attendenceEntity> getAttendanceByStudentId(int studentId) {
		String hql = "FROM attendenceEntity WHERE student.id = :sid";

	    return getSession()
	            .createQuery(hql, attendenceEntity.class)
	            .setParameter("sid", studentId)
	            .list();
	}

	@Override
	public attendenceEntity getAttendanceByStudentAndDate(int studentId, Date date) {
		 String hql = "FROM attendenceEntity WHERE student.id = :sid AND date = :d";

		    return getSession()
		            .createQuery(hql, attendenceEntity.class)
		            .setParameter("sid", studentId)
		            .setParameter("d", date)
		            .uniqueResult();
	}

	@Override
	public List<attendenceEntity> getAllAttendance() {
		String hql = "FROM attendenceEntity";

	    return getSession()
	            .createQuery(hql, attendenceEntity.class)
	            .list();
	}

}
