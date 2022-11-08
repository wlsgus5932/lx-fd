package com.kodasfiledata.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodasfiledata.entity.Sensor;
import com.kodasfiledata.parameter.SensorParameter;
import com.kodasfiledata.service.SensorService;

@RestController
@RequestMapping("/rest/api/")
public class SensorController {
	@Autowired
	private SensorService service;
	
	@PostMapping("sensorList")
	public List<Sensor> getSensor(@ModelAttribute SensorParameter param) {
		List<Sensor> list = service.getSensorList(param);
		int total = service.getSensorListTotalparam(param);
		if(list.size() > 0) {
			list.get(0).setTotal_count(total);
		}
		return list;
	}
	
	@PostMapping("sensorListAll")
	public List<Sensor> getSensorAll(@ModelAttribute SensorParameter param) {
		List<Sensor> list = service.getSensorListAll(param);
		int total = service.getSensorListTotalparam(param);
		if(list.size() > 0) {
			list.get(0).setTotal_count(total);
		}
		return list;
	}
	 
}
