package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Member;
import com.example.repository.MemberRepository;
import com.example.util.PrettyPrintingMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RestController {
	
	@Autowired
	MemberRepository memberRepository;

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
	
	
	@ResponseBody
	@GetMapping ("/api/page")
	public Page<Member> getList() { 
		PageRequest pageRequest=
				new PageRequest(10,20,new Sort(Direction.DESC,"id"));
		return memberRepository.findAll(pageRequest); 
	}
	 
	
	@ResponseBody
	@GetMapping("/api/where")
	public Page<Member> getListWhere() {
		
		PageRequest pageRequest=
				new PageRequest(0,10,new Sort(Direction.DESC,"id"));

		return memberRepository.findByEmailContainingAndPasswordAndStatus("", "", 0, pageRequest);
	}
	
	@ResponseBody
	@PostMapping("/api/create")
	public void create(@RequestBody Member member) {
		memberRepository.save(member);
	}
	
}
