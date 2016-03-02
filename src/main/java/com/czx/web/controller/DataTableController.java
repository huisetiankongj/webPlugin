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
	
	//特性介绍
	@RequestMapping("feature")
	public Object feature(){
		return "dataTable/feature";
	}
	//混合标题
	@RequestMapping("complexHeaders")
	public Object complexHeaders(){
		return "dataTable/complexHeaders";
	}
}
