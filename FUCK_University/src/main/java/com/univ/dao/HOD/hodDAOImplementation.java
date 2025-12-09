package com.univ.dao.HOD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.univ.dao.student.*;
import com.univ.entity.attendenceEntity;
import com.univ.entity.facultyEntity;
import com.univ.entity.studentEntity;

@Repository
@Transactional
public class hodDAOImplementation implements hodDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean registerStudent(studentEntity student) {
		try {
			getSession().save(student);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean registerFaculty(facultyEntity faculty) {
		try {
			getSession().save(faculty);
			return true;
		}catch(Exception e) {
			return false;
		}
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
	public boolean deleteStudent(int id) {
		 try {
		        studentEntity st = getSession().get(studentEntity.class, id);
		        if(st != null) {
		            getSession().delete(st);
		            return true;
		        } else {
		            return false;
		        }
		    } catch(Exception e) {
		        return false;
		    }
	}

	@Override
	public boolean deleteFaculty(int id) {
		 try {
		        facultyEntity fc = getSession().get(facultyEntity.class, id);
		        if(fc != null) {
		            getSession().delete(fc);
		            return true;
		        } else {
		            return false;
		        }
		    } catch(Exception e) {
		        return false;
		    }
	}

	@Override
	public List<studentEntity> getAllStudents() {
		String hql = "FROM studentEntity";

	    return getSession()
	            .createQuery(hql, studentEntity.class)
	            .list();
	}

	@Override
	public List<facultyEntity> getAllFaculty() {
		String hql = "FROM facultyEntity";

	    return getSession()
	            .createQuery(hql, facultyEntity.class)
	            .list();
	}

}
