package com.czx.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web/")
public class WebController {

	@RequestMapping("web")
	public Object userList(){
		return "";
	}
}
