package com.study.zqwstudy.web.ch4_4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.zqwstudy.domain.DemoObj;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg,DemoObj obj){//1
		
		throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute:"+ msg);
	}
	@ResponseBody
	@RequestMapping("/advice2")
	public String getSomething2(@ModelAttribute("msg") String msg,DemoObj obj){//1

			return "advice2";
//		throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute:"+ msg);
	}

}
