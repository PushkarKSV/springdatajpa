package com.kpr.springjpademo.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
	@Id
	Integer id;
	String name;
	Integer salaray;
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
	public Integer getSalaray() {
		return salaray;
	}
	public void setSalaray(Integer salaray) {
		this.salaray = salaray;
	}
	
	
}
