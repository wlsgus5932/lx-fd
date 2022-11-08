package com.kodasfiledata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodasfiledata.dao.SpatialDao;
import com.kodasfiledata.entity.Sector;
import com.kodasfiledata.entity.Spatial;
import com.kodasfiledata.parameter.SectorParameter;
import com.kodasfiledata.parameter.SpatialParameter;

@Service
public class SpatialServiceImp implements SpatialService {
	
	@Autowired
	private SpatialDao dao;

	@Override
	public List<Spatial> getSpatialList(SpatialParameter param) {
		return dao.getSpatialList(param);
	}

	@Override
	public List<Sector> getIsSectorList(SectorParameter param) {
		return dao.getIsSectorList(param);
	}

	@Override
	public List<Sector> getIsSectorListAll() {
		return dao.getIsSectorListAll();
	}

	@Override
	public List<Sector> getIsSectorOneList(SectorParameter param) {
		return dao.getIsSectorOneList(param);
	}
	
	
	

}
