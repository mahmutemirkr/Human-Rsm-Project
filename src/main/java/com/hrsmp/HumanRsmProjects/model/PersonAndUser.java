package com.hrsmp.HumanRsmProjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="person_user")
public class PersonAndUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user_id", nullable=false)
	private Long userId;
	
	@Column(name="person_id", nullable=false)
	private Long personId;
	

}
