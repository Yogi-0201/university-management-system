package com.univ.dao.faculty;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.univ.entity.attendenceEntity;
import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;

@Repository
@Transactional
public class facultyDAOImplementation implements FacultyDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public facultyEntity login(String email, String pass) {
        String hql = "FROM facultyEntity WHERE email = :e AND pass = :p";
		return getSession().createQuery(hql, facultyEntity.class).setParameter("e", email).setParameter("p", pass).uniqueResult();
		
	}

	@Override
	public boolean updateFaculty(facultyEntity faculty) {
		 try {
			 getSession().merge(faculty);
				return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

	@Override
	public facultyEntity getFacultyById(int id) {
		return getSession().get(facultyEntity.class, id);
	}

	@Override
	public studentEntity getStudentById(int id) {
		return getSession().get(studentEntity.class, id);
	}

	@Override
	public boolean markAttendance(attendenceEntity attendance) {
		try {
			getSession().save(attendance);
			return true;
		}catch(Exception e) {
			return false;
		}
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
	public List<studentEntity> getStudentsByDept(String dept) {

	    String hql = "FROM studentEntity WHERE deptartment = :d";

	    return getSession()
	            .createQuery(hql, studentEntity.class)
	            .setParameter("d", dept)
	            .list();
	}
	
	@Override
	public List<studentEntity> getAllStudentsForAttendance() {

	    String hql = "FROM studentEntity"; // agar department-wise filter chahiye to later add karenge

	    return getSession()
	            .createQuery(hql, studentEntity.class)
	            .list();
	}


}
