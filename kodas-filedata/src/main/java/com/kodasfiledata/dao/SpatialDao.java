package com.kodasfiledata.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.kodasfiledata.entity.Sector;
import com.kodasfiledata.entity.Spatial;
import com.kodasfiledata.parameter.SectorParameter;
import com.kodasfiledata.parameter.SpatialParameter;

@Mapper
public interface SpatialDao {
	public List<Spatial> getSpatialList(SpatialParameter param);

	public List<Sector> getIsSectorList(SectorParameter param);

	public List<Sector> getIsSectorListAll();

	public List<Sector> getIsSectorOneList(SectorParameter param);
	
}
