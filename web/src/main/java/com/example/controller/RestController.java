package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Member;
import com.example.util.PrettyPrintingMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RestController {

	@ResponseBody
	@PostMapping("/api/test")
	public List<Member> apiTest(@RequestBody Map<String, Object> req) {
		
		log.info("=====================apiTest================================");
		
		PrettyPrintingMap ppMap = new PrettyPrintingMap<>(req);
		log.info("ppMap: {}", ppMap.toString());
		
		
		Member mb1 = new Member();
		mb1.setEmail("xxx@aaa.com");
		Member mb2 = new Member();
		mb1.setEmail("yyy@bbb.com");
		
		List<Member> list = new ArrayList<>();
		
		list.add(mb1);
		list.add(mb2);

		return list;
	}
	
}
