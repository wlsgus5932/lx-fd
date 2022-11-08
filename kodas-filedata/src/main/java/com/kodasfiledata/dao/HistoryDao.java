package com.kodasfiledata.dao;



import org.apache.ibatis.annotations.Mapper;

import com.kodasfiledata.entity.History;
import com.kodasfiledata.parameter.HistoryParameter;

@Mapper
public interface HistoryDao {

	public void setHistoryList(History param);

	public void setHistoryList(HistoryParameter param);

//	public void setHistoryList(String listNm, String dataNm, String userId);

}
