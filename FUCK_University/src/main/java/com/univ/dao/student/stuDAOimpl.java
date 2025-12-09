package com.univ.dao.student;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.univ.entity.studentEntity;


@Repository
@Transactional
public class stuDAOimpl implements studentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean register(studentEntity student) {
		try {
		Serializable id = getSession().save(student);
		return id != null ;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public studentEntity login(String email, String pass) {
		
		String hql = "FROM studentEntity WHERE email = :e AND pass = :p";
		
		return getSession().createQuery(hql, studentEntity.class).setParameter("e", email).setParameter("p", pass).uniqueResult();
	}

	@Override
	public studentEntity getStudentById(int id) {
		
		return getSession().get(studentEntity.class, id);
	}

	@Override
	public boolean updateStudent(studentEntity student) {
		
		 try {
			 getSession().merge(student);
				return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

}
