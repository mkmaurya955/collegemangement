package com.example.collegemangement.service;

import java.util.Optional;

import com.example.collegemangement.vo.InstituteVO;

public interface InstituteService {

	/**
	 * Saving of Institute details
	 * 
	 * @param instituteVO
	 */
	void saveInstituteDetails(InstituteVO instituteVO);

	/**
	 * Get Institute Data By Name
	 * 
	 * @param name
	 * @return instituteVO
	 */
	Optional<InstituteVO> getInstituteData(String name);

}
