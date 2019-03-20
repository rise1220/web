package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberRepository memberDao;

	@RequestMapping("/add")
	@ResponseBody
	public Member add(Member member){
		Member memberData = memberDao.save(member);
		return memberData;
	}

	@RequestMapping("/view/{id}")
	@ResponseBody
	public Optional<Member> view(@PathVariable int id) {
		Optional<Member> memberData = memberDao.findById(id);
		return memberData;
	}	

	@RequestMapping("/list")
	@ResponseBody
	public List<Member> list(){
		List<Member> memberList = memberDao.findAll();
		return memberList;
	}

	@RequestMapping("/del/{id}")
	public String delete(@PathVariable int id){
		System.out.println("id=" + id);
		memberDao.deleteById(id);
		return "redirect:/member/view/list";
	}

	@RequestMapping("/edit/{id}")
	@ResponseBody
	public Member edit(Member member){
		Member memberData = memberDao.save(member);
		return memberData;
	}
}
