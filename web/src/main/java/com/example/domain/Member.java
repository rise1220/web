package com.example.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	int status;
	
	@OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="id", insertable = false)
    private Orders order;
}
