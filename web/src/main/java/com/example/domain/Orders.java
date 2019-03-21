package com.example.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Orders {
	
	@Id
	int seq;
	int price;
	String product;
	int id;
	
	/*
	 * @ManyToOne(cascade={CascadeType.ALL})
	 * 
	 * @JoinColumn(name="id") private Member member;
	 */
}
