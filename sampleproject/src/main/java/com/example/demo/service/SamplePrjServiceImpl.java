package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SamplePrjMapper;
import com.example.demo.vo.SamplePrjVO;

@Service
public class SamplePrjServiceImpl implements SamplePrjService{

	@Autowired
	SamplePrjMapper mapper;

	@Override
	public String selectUsrNm() throws Exception {
		return mapper.selectUsrNm();
	}

	@Override
	public String selectUsrCmt() throws Exception {
		return mapper.selectUsrCmt();
	}

}
