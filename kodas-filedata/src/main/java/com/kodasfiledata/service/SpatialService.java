package com.kodasfiledata.service;

import java.util.List;

import com.kodasfiledata.entity.Sector;
import com.kodasfiledata.entity.Spatial;
import com.kodasfiledata.parameter.SectorParameter;
import com.kodasfiledata.parameter.SpatialParameter;

public interface SpatialService {
	public List<Spatial> getSpatialList(SpatialParameter param);
	public List<Sector> getIsSectorList(SectorParameter param);
	public List<Sector> getIsSectorListAll();
	public List<Sector> getIsSectorOneList(SectorParameter param);

}
