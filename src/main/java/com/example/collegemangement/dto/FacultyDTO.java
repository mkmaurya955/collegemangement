package com.example.collegemangement.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.collegemangement.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Entity
@Document(collection = "faculty")
public class FacultyDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 72968042864620766L;

	@Id
	private String id;

	private String name;
	
	private String email;
	
	private String mobile;
	
	private String qualification;
	
	private String gender;
	
	private String address;
	
	private String empId;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfJoin;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the dateOfJoin
	 */
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	/**
	 * @param dateOfJoin the dateOfJoin to set
	 */
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

}
