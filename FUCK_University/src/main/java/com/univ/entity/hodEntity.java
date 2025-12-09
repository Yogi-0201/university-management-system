package com.univ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hod")
public class hodEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String pass;
	private String deptartment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDeptartment() {
		return deptartment;
	}
	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}
	@Override
	public String toString() {
		return "hodEntity [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", deptartment="
				+ deptartment + "]";
	}
}
