package com.kodasfiledata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodasfiledata.dao.SensorDao;
import com.kodasfiledata.entity.Sensor;
import com.kodasfiledata.parameter.SensorParameter;

@Service
public class SensorServiceImp implements SensorService {
	
	@Autowired
	private SensorDao dao;

	@Override
	public List<Sensor> getSensorList(SensorParameter param) {
		return dao.getSensorList(param);
	}

	@Override
	public int getSensorListTotalparam(SensorParameter param) {
		return dao.getSensorListTotal(param);
	}

	@Override
	public List<Sensor> getSensorListAll(SensorParameter param) {
		return dao.getSensorListAll(param);
	}

}
