package com.example.collegemangement.dao;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.collegemangement.dto.SectionsDTO;

/**
 * 
 * @author saradhi
 *
 */

@Repository
public interface SectionsDAO extends CrudRepository<SectionsDTO, Serializable>{

}
