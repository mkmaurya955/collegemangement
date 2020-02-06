package com.example.collegemangement.mapper;

import org.springframework.stereotype.Component;

import com.example.collegemangement.base.BaseMapper;
import com.example.collegemangement.dto.YearsDTO;
import com.example.collegemangement.vo.YearsVO;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class YearsMapper extends BaseMapper<YearsDTO, YearsVO> {

	@Override
	public YearsVO convertEntity(YearsDTO dto) {
		YearsVO vo = new YearsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public YearsDTO convertVO(YearsVO vo) {
		YearsDTO dto = new YearsDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.isStatus(), dto::setStatus);
		return dto;
	}
}
