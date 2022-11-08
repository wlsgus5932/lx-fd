package com.kodasfiledata.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.kodasfiledata.dao.HistoryDao;
import com.kodasfiledata.parameter.HistoryParameter;

@Service
public class HistoryServiceImp implements HistoryService{
	@Autowired
	private HistoryDao dao;
	

	@Override
	public void setHistoryList(HistoryParameter param) {
		dao.setHistoryList(param);
		
	}

//	@Override
//	public void setHistoryList(String listNm, String dataNm, String userId) {
//		dao.setHistoryList(listNm, dataNm, userId);
//		
//	};

}
