package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.SamplePrjVO;

@Mapper
public interface SamplePrjMapper {

	String selectUsrNm();

	String selectUsrCmt();

}
