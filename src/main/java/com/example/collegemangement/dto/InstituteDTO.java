package com.example.collegemangement.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.collegemangement.base.BaseEntity;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Entity
@Document(collection = "institute")
public class InstituteDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4680302792150781336L;

	@Id
	private String id;

	private String name;

	private boolean status;

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
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}
