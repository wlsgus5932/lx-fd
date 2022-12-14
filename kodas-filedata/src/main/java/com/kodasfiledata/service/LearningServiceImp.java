package com.kodasfiledata.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodasfiledata.dao.LearningDao;
import com.kodasfiledata.entity.Fixed;
import com.kodasfiledata.entity.Learning;
import com.kodasfiledata.parameter.FixedParameter;
import com.kodasfiledata.parameter.LearningParameter;

@Service
public class LearningServiceImp implements LearningService {
	@Autowired
	private LearningDao dao;


	@Override
	public List<Learning> getLearningList(LearningParameter param) {
		return dao.getLearningList(param);
	}


	@Override
	public int getLearningListTotal(LearningParameter param) {
		return dao.getLearningListTotal(param);
	}


	@Override
	public List<Learning> getLearningListAll(LearningParameter param) {
		return dao.getLearningListAll(param);
	}

	@Override
	public List<Fixed> getFixedList(FixedParameter param) {
		return dao.getFixedList(param);
	}


}
