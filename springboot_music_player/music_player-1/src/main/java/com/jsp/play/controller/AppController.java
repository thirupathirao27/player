package com.jsp.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AppController {

	@RequestMapping("/msg")
	@ResponseBody
	public String getMessage()
	{
		return "Msg is displayed";
	}
}
