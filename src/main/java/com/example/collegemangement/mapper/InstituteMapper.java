package com.example.collegemangement.mapper;

import org.springframework.stereotype.Component;

import com.example.collegemangement.base.BaseMapper;
import com.example.collegemangement.dto.InstituteDTO;
import com.example.collegemangement.vo.InstituteVO;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class InstituteMapper extends BaseMapper<InstituteDTO, InstituteVO> {

	/**
	 * Conversion of DTO to VO
	 */
	@Override
	public InstituteVO convertEntity(InstituteDTO dto) {
		InstituteVO vo = new InstituteVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	/**
	 * Conversion of VO to DTO
	 */
	@Override
	public InstituteDTO convertVO(InstituteVO vo) {
		InstituteDTO dto = new InstituteDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.isStatus(), dto::setStatus);
		return dto;
	}

}
