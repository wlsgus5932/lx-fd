package com.kodasfiledata.service;

import java.util.List;

import com.kodasfiledata.entity.Fixed;
import com.kodasfiledata.entity.Learning;
import com.kodasfiledata.parameter.FixedParameter;
import com.kodasfiledata.parameter.LearningParameter;

public interface LearningService {
	public List<Learning> getLearningList(LearningParameter param);

	public int getLearningListTotal(LearningParameter param);

	public List<Learning> getLearningListAll(LearningParameter param);

	public List<Fixed> getFixedList(FixedParameter param);

}
