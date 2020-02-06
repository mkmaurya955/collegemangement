package com.example.collegemangement.mapper;

import org.springframework.stereotype.Component;

import com.example.collegemangement.base.BaseMapper;
import com.example.collegemangement.dto.SectionsDTO;
import com.example.collegemangement.vo.SectionsVO;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class SectionsMapper extends BaseMapper<SectionsDTO, SectionsVO> {

	/**
	 * Conversion of DTO to VO
	 */
	public SectionsVO convertEntity(SectionsDTO dto) {
		SectionsVO vo = new SectionsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.getStatus(), vo::setStatus);
		return vo;
	}

	/**
	 * Conversion of VO to DTO
	 */
	@Override
	public SectionsDTO convertVO(SectionsVO vo) {
		SectionsDTO dto = new SectionsDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.isStatus(), dto::setStatus);
		return dto;
	}

}
