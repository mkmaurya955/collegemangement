package com.example.collegemangement.dao;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.collegemangement.dto.InstituteDTO;

@Repository
public interface InstituteDAO extends CrudRepository<InstituteDTO, Serializable> {

	/**
	 * Find By Name from "Institute details"
	 * 
	 * @param name
	 * @return InstituteDTO
	 */
	Optional<InstituteDTO> findByName(String name);

}
