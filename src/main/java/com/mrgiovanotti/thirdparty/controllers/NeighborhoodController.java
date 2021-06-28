package com.mrgiovanotti.thirdparty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.thirdparty.entities.dto.NeighborhoodDTO;
import com.mrgiovanotti.thirdparty.services.NeighborhoodService;

@RestController
@RequestMapping("/neighborhood")
public class NeighborhoodController {

	@Autowired
	NeighborhoodService neighborhoodService;

	@GetMapping("/list")
	public List<NeighborhoodDTO> getAllNeighborhoods() {
		return neighborhoodService.findAll();
	}

}
