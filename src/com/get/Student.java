package com.get;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "STUDENT")
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3575396530774998409L;
	private int id;
	private String name;
	private String course;
	
	@Id
	@Column( name = "ID", length = 34, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column( name = "NAME", length = 45, nullable = true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column( name = "COURSE", length = 78, nullable = true)
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String toString(){
		return name+":"+course;
	}
	
}
