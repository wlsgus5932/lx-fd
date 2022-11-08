package com.kodasfiledata.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kodasfiledata.entity.Sensor;
import com.kodasfiledata.parameter.SensorParameter;

@Mapper
public interface SensorDao {
	List<Sensor> getSensorList(SensorParameter param);

	public int getSensorListTotal(SensorParameter param);

	List<Sensor> getSensorListAll(SensorParameter param);
}
