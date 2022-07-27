package com.example.demo.vo;

import lombok.Data;

@Data
public class SamplePrjVO {

	private Long id;
	private String usr_nm;
	private String usr_cmt;


	public SamplePrjVO() {

	}

	public SamplePrjVO(String usr_nm, String usr_cmt) {
		this.usr_nm = usr_nm;
		this.usr_cmt = usr_cmt;
	}

}
