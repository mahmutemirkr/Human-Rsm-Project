package com.hrsmp.HumanRsmProjects.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "username", unique = true , nullable= false, length=100)
	private String username;
	
	@Column(name= "password", nullable= false, length=100)
	private String password;
	
	@Column(name= "name_surname", nullable= false, length=100)
	private String nameSurname;
	
	@Column(name= "create_time", nullable= false)
	private LocalDateTime createTime;
	
	@Enumerated(EnumType.STRING)
	@Column(name= "role", nullable= false, length=100)
	private Role role;
	
	@Transient
	private String token;

}
