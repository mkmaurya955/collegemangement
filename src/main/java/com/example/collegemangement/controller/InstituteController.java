package com.example.collegemangement.controller;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemangement.base.BadRequestException;
import com.example.collegemangement.base.GateWayResponse;
import com.example.collegemangement.service.InstituteService;
import com.example.collegemangement.vo.InstituteVO;

@RestController
@CrossOrigin
public class InstituteController {

	@Autowired
	private InstituteService instituteService;

	/**
	 * Saving of Institute Data
	 * 
	 * @param instituteVO
	 * @return success message
	 */
	@PostMapping(path = "/saveInstituteData", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public GateWayResponse<?> saveInstituteData(@RequestBody InstituteVO instituteVO) {
		try {
			if (Objects.isNull(instituteVO)) {
				return new GateWayResponse<>(HttpStatus.BAD_REQUEST, "Invalid Input");
			}
			instituteService.saveInstituteDetails(instituteVO);
		} catch (BadRequestException e) {
			return new GateWayResponse<>(HttpStatus.BAD_REQUEST, e.getMessage());
		} catch (Exception e) {
			return new GateWayResponse<>(HttpStatus.BAD_REQUEST, e.getMessage());
		}
		return new GateWayResponse<>("success");
	}

	@GetMapping(path = "/getInstituteData", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public GateWayResponse<?> getInstituteData(@RequestParam("name") String name) {
		try {
			Optional<InstituteVO> instituteVO = instituteService.getInstituteData(name);
			if (instituteVO.isPresent()) {
				return new GateWayResponse<>(instituteVO.get());
			}
		} catch (BadRequestException e) {
			return new GateWayResponse<>(HttpStatus.BAD_REQUEST, e.getMessage());
		} catch (Exception e) {
			return new GateWayResponse<>(HttpStatus.BAD_REQUEST, e.getMessage());
		}

		return null;
	}

}
