package com.kodasfiledata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodasfiledata.entity.Fixed;
import com.kodasfiledata.entity.Learning;
import com.kodasfiledata.parameter.FixedParameter;
import com.kodasfiledata.parameter.LearningParameter;
import com.kodasfiledata.service.LearningService;

	
@RestController
@RequestMapping("/rest/api/")
public class LearningController {
		@Autowired
		private LearningService service;
		
		@PostMapping("learningList")
		private List<Learning> getLearning(@ModelAttribute LearningParameter param) {
			List<Learning> list = service.getLearningList(param);
			int total = service.getLearningListTotal(param);
			if(list.size() > 0) {
				list.get(0).setTotal_count(total);
			}
			return list;
		}
		
		@PostMapping("learningListAll")
		private List<Learning> getLearningAll(@ModelAttribute LearningParameter param) {
			List<Learning> list = service.getLearningListAll(param);
			int total = service.getLearningListTotal(param);
			if(list.size() > 0) {
				list.get(0).setTotal_count(total);
			}
			return list;
		}
		
		@PostMapping("fixedList")
		private List<Fixed> getFixed(@ModelAttribute FixedParameter param) {
			List<Fixed> list = service.getFixedList(param);
			return list;
		}
}
