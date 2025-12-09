package com.univ.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="attendence")
public class attendenceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String status;
	@ManyToOne
	@JoinColumn(name="student_id")
	private studentEntity student;
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private facultyEntity faculty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public studentEntity getStudent() {
		return student;
	}
	public void setStudent(studentEntity student) {
		this.student = student;
	}
	public facultyEntity getFaculty() {
		return faculty;
	}
	public void setFaculty(facultyEntity faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "attendenceEntity [id=" + id + ", date=" + date + ", status=" + status + ", student=" + student
				+ ", faculty=" + faculty + "]";
	}
}
