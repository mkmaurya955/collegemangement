package com.example.collegemangement.vo;

import com.example.collegemangement.base.BaseVO;

/**
 * 
 * @author saradhi
 *
 */

public class SectionsVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
