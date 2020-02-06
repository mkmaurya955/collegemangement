package com.example.collegemangement.dao;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.collegemangement.dto.DepartmentsDTO;

@Repository
public interface DepartmentsDAO extends CrudRepository<DepartmentsDTO, Serializable> {

	Optional<DepartmentsDTO> findByName(String name);

}
