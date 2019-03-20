package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Entity
@Data
public class Member {

	@Id
	/*
	 * @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_seq")
	 * 
	 * @GenericGenerator(name="member_seq",
	 * strategy="com.example.util.DatePrefixedSequenceIdGenerator", parameters= {
	 * 
	 * @Parameter(name=), })
	 */
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String email;
	String password;
}
