package com.example.collegemangement.mapper;

import org.springframework.stereotype.Component;

import com.example.collegemangement.base.BaseMapper;
import com.example.collegemangement.dto.FacultyDTO;
import com.example.collegemangement.vo.FacultyVO;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class FacultyMapper extends BaseMapper<FacultyDTO, FacultyVO> {

	@Override
	public FacultyVO convertEntity(FacultyDTO dto) {

		FacultyVO vo = new FacultyVO();

		funPoint(dto.getAddress(), vo::setAddress);
		funPoint(dto.getDateOfBirth(), vo::setDateOfBirth);
		funPoint(dto.getDateOfJoin(), vo::setDateOfJoin);
		funPoint(dto.getEmail(), vo::setEmailId);
		funPoint(dto.getEmpId(), vo::setEmpId);
		funPoint(dto.getGender(), vo::setGender);
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getMobile(), vo::setMobileNo);
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.getQualification(), vo::setQualification);

		return vo;
	}

	public FacultyDTO convertVO(FacultyVO vo) {

		FacultyDTO dto = new FacultyDTO();

		funPoint(vo.getAddress(), dto::setAddress);
		funPoint(vo.getDateOfBirth(), dto::setDateOfBirth);
		funPoint(vo.getDateOfJoin(), dto::setDateOfJoin);
		funPoint(vo.getEmailId(), dto::setEmail);
		funPoint(vo.getEmpId(), dto::setEmpId);
		funPoint(vo.getGender(), dto::setGender);
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getMobileNo(), dto::setMobile);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.getQualification(), dto::setQualification);

		return dto;

	}
}
