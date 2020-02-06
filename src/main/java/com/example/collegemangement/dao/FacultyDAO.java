package com.example.collegemangement.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.collegemangement.dto.FacultyDTO;

@Repository
public interface FacultyDAO extends CrudRepository<FacultyDTO, Serializable> {

}
