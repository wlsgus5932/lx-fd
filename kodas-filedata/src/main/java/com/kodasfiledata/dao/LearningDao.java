package com.kodasfiledata.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.kodasfiledata.entity.Fixed;
import com.kodasfiledata.entity.Learning;
import com.kodasfiledata.parameter.FixedParameter;
import com.kodasfiledata.parameter.LearningParameter;

@Mapper
public interface LearningDao {
	public List<Learning> getLearningList(LearningParameter param);

	public int getLearningListTotal(LearningParameter param);

	public List<Learning> getLearningListAll(LearningParameter param);

	public List<Fixed> getFixedList(FixedParameter param);

}
