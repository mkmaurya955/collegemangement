package com.example.collegemangement.dao;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.collegemangement.dto.YearsDTO;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Repository
public interface YearsDAO extends CrudRepository<YearsDTO, Serializable> {

	Optional<YearsDTO> findByName(String name);

}
