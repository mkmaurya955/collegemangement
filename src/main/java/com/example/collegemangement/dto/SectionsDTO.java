package com.example.collegemangement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.collegemangement.base.BaseEntity;

/**
 * 
 * @author saradhi
 *
 */

//which allows us to choose the particular collection 
@Entity
@Document(collection = "sections")
public class SectionsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String name;

	private String classes;

	private Boolean status;

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
	 * @return the classes
	 */
	public String getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(String classes) {
		this.classes = classes;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
