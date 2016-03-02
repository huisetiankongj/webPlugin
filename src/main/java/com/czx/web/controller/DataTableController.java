package com.czx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dataTable/")
public class DataTableController {

	@RequestMapping("zeroConfiguration")
	public Object zeroConfiguration(){
		return "dataTable/zeroConfiguration";
	}
	
	//���Խ���
	@RequestMapping("feature")
	public Object feature(){
		return "dataTable/feature";
	}
	//��ϱ���
	@RequestMapping("complexHeaders")
	public Object complexHeaders(){
		return "dataTable/complexHeaders";
	}
}
