package com.kodasfiledata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodasfiledata.parameter.HistoryParameter;
import com.kodasfiledata.service.HistoryService;

@RestController
@RequestMapping("/rest/api/")
public class HistoryController {
	@Autowired
	private HistoryService service;
	
	@PostMapping("historyList")
	public void getHistory(@ModelAttribute HistoryParameter param) {
		System.out.println(param.getDataNm());
		service.setHistoryList(param);
	}

}
