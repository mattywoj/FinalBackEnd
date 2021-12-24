package com.Final.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="residents")
public class Resident {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Integer id;
	String name;
	Integer age;
	String Vaccinemanu;
	String Vaccinestatus;
	String date;
	

 public Resident(Integer id, String name, Integer age, String Vaccinemanu, String Vaccinestatus, String date) {
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.Vaccinemanu=Vaccinemanu;
	 this.Vaccinestatus=Vaccinestatus;
	 this.date=date;
 }
 public Resident() {
	 
 }
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getVaccinemanu() {
	return Vaccinemanu;
}
public void setVaccinemanu(String Vaccinemanu) {
	this.Vaccinemanu = Vaccinemanu;
}
public String getVaccineStatus() {
	return Vaccinestatus;
}
public void setVaccineStatus(String Vaccinestatus) {
	this.Vaccinestatus = Vaccinestatus;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
 
 
}