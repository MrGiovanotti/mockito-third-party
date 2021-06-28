package com.mrgiovanotti.thirdparty.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrgiovanotti.thirdparty.entities.Neighborhood;
import com.mrgiovanotti.thirdparty.entities.dto.NeighborhoodDTO;
import com.mrgiovanotti.thirdparty.repositories.NeighborhoodRepository;
import com.mrgiovanotti.thirdparty.services.NeighborhoodService;

@Service
public class NeighborhoodServiceImpl implements NeighborhoodService {

	@Autowired
	NeighborhoodRepository neighborhoodRepository;

	@Override
	public List<NeighborhoodDTO> findAll() {
		List<Neighborhood> neighborhoods = neighborhoodRepository.findAll();
		return neighborhoods.stream().map(NeighborhoodDTO::new).collect(Collectors.toList());
	}

}
