package com.example.collegemangement.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemangement.base.BadRequestException;
import com.example.collegemangement.dao.InstituteDAO;
import com.example.collegemangement.dto.InstituteDTO;
import com.example.collegemangement.mapper.InstituteMapper;
import com.example.collegemangement.service.InstituteService;
import com.example.collegemangement.vo.InstituteVO;

@Service
public class InstituteServiceImpl implements InstituteService {

	@Autowired
	private InstituteDAO instituteDAO;

	@Autowired
	private InstituteMapper instituteMapper;

	@Override
	public void saveInstituteDetails(InstituteVO instituteVO) {
		validateInstituteDetails(instituteVO.getName());
		InstituteDTO dto = instituteMapper.convertVO(instituteVO);
		dto.setCreatedDate(LocalDateTime.now());
		dto.setStatus(Boolean.TRUE);
		instituteDAO.save(dto);
	}

	private void validateInstituteDetails(String name) {
		Optional<InstituteDTO> instituteDetails = instituteDAO.findByName(name);
		if (instituteDetails.isPresent()) {
			throw new BadRequestException("Institute Details already found with this name");
		}
	}

	@Override
	public Optional<InstituteVO> getInstituteData(String name) {
		Optional<InstituteDTO> instituteDetails = instituteDAO.findByName(name);
		if (!instituteDetails.isPresent()) {
			throw new BadRequestException("No records Found");
		}
		return instituteMapper.convertEntity(instituteDetails);
	}

}
