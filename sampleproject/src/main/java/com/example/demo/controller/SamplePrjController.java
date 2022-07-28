package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.SamplePrjMapper;
import com.example.demo.service.SamplePrjService;
import com.example.demo.vo.SamplePrjVO;

@Controller
public class SamplePrjController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	SamplePrjService service;

	@Autowired
	private SamplePrjMapper mapper;

	@RequestMapping(value="/home")
	public String main(Model model) throws Exception {
		Map<String,Object> map = new HashMap<>();

		String cmt = "Thymeleaf Hello";
		String usrNm = service.selectUsrNm();
		String usrCmt = service.selectUsrCmt();


		map.put("welcome", cmt);
		map.put("usrNm", usrNm);
		map.put("usrCmt", usrCmt);

		log.info("\nSelect 1 : " + usrNm + "\nSelect 2 : " + usrCmt);

		model.addAttribute("hello", map);
		return "thymeleaf/goodThymeLeaf";
	}

	@RequestMapping(value = "/home/funcTest")
	public String testFunc(){
		return "thymeleaf/thymeleafFuncPg";
	}
}
