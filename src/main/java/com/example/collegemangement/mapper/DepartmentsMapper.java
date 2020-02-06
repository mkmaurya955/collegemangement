package com.example.collegemangement.mapper;

import org.springframework.stereotype.Component;

import com.example.collegemangement.base.BaseMapper;
import com.example.collegemangement.dto.DepartmentsDTO;
import com.example.collegemangement.vo.DepartmentsVO;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class DepartmentsMapper extends BaseMapper<DepartmentsDTO, DepartmentsVO> {

	@Override
	public DepartmentsVO convertEntity(DepartmentsDTO dto) {
		DepartmentsVO vo = new DepartmentsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.getStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public DepartmentsDTO convertVO(DepartmentsVO vo) {
		DepartmentsDTO dto = new DepartmentsDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.getStatus(), dto::setStatus);
		return dto;
	}

}
