package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WebController {
	
	//web
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "home";
	}
	
	@RequestMapping("/hello")
	public String jspPage(Model model) {
		model.addAttribute("name", "hello page");
		return "hello";
	}
	
	@RequestMapping("/member/view/list")
	public String list(Model model) {
		model.addAttribute("name", "hello page");
		return "/member/view/list";
	}
	
	@RequestMapping("/member/view/add")
	public String add(Model model) {
		model.addAttribute("name", "hello page");
		return "/member/view/add";
	}
	
	@RequestMapping("/member/view/mod")
	public String mod(Model model) {
		model.addAttribute("name", "hello page");
		return "/member/view/mod";
	}
	
}
