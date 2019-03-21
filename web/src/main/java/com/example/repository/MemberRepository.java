package com.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	public Page<Member> findByEmailContainingAndPasswordAndStatus(String Email, String password, int status, Pageable pageable);

}
