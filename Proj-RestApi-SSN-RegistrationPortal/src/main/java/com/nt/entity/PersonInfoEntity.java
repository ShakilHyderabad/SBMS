package com.nt.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="REGISTRATION_MASTER")
public class PersonInfoEntity {
   @Id
   @SequenceGenerator(name="seq", sequenceName="res_seq", allocationSize=1)
   @GeneratedValue(strategy=GenerationType.AUTO, generator="seq")
   @Column(name="SSN")
	private int ssn;
   @Column(name="P_NAME")
	private String fistName;
   @Column(name="P_LNAME")
	private String lastName;
   @Column(name="GENDER")
	private String gendar;
   @Column(name="DOB")
	private String dob;
   @Column(name="STATE")
	private String state;
   @Column(name="CRT_DATE")
  // @CreationTimestamp
   //@Temsporal(TemporalType.DATE)
   private  String createdDate;
   @Column(name="MODF_DATE")
   //@UpdateTimestamp
   //@Temporal(TemporalType.DATE)
   private  String modiDate;

   
   public PersonInfoEntity() {

   }


public int getSsn() {
	return ssn;
}


public void setSsn(int ssn) {
	this.ssn = ssn;
}


public String getFistName() {
	return fistName;
}


public void setFistName(String fistName) {
	this.fistName = fistName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getGendar() {
	return gendar;
}


public void setGendar(String gendar) {
	this.gendar = gendar;
}


public String getDob() {
	return dob;
}


public void setDob(String dob) {
	this.dob = dob;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getCreatedDate() {
	return createdDate;
}


public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}


public String getModiDate() {
	return modiDate;
}


public void setModiDate(String modiDate) {
	this.modiDate = modiDate;
}


@Override
public String toString() {
	return "PersonInfoEntity [ssn=" + ssn + ", fistName=" + fistName + ", lastName=" + lastName + ", gendar=" + gendar
			+ ", dob=" + dob + ", state=" + state + ", createdDate=" + createdDate + ", modiDate=" + modiDate + "]";
}
   
   
   
   
	



}
