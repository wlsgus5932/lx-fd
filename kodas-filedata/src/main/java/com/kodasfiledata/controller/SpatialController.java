package com.kodasfiledata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodasfiledata.entity.Sector;
import com.kodasfiledata.entity.Spatial;
import com.kodasfiledata.parameter.SectorParameter;
import com.kodasfiledata.parameter.SpatialParameter;
import com.kodasfiledata.service.SpatialService;

@RestController
@RequestMapping("/rest/api/")
public class SpatialController {
		@Autowired
		private SpatialService service;
			
		@PostMapping("spatialList")
		private List<Spatial> getSpatialList(@ModelAttribute SpatialParameter param) {
			List<Spatial> list = service.getSpatialList(param);
			return list;
		}
		
		@GetMapping("isSectorList")
		private List<Sector> getSectorList(@ModelAttribute SectorParameter param) {
			List<Sector> list = service.getIsSectorList(param);
			
			return list;
		}
		
		@GetMapping("isSectorOneList")
		private List<Sector> getSectorOneList(@ModelAttribute SectorParameter param) {
			List<Sector> list = service.getIsSectorOneList(param);
			return list;
		}
		
		@GetMapping("isSectorListAll")
		private List<Sector> getSectorListAll() {
			List<Sector> list = service.getIsSectorListAll();
			return list;
		}
}
