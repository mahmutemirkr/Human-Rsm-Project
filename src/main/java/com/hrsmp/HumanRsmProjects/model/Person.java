package com.hrsmp.HumanRsmProjects.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="persons")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name= "name", nullable = false, length = 100)
	private String name;
	
	
	@Column(name= "surname", nullable = false, length = 100)
	private String surname;
	
	
	@Column(name= "age", nullable = false)
	private String age;
	
	
	@Column(name= "gender", nullable = false)
	private String gender;
	
	
	@Column(name= "education_status", nullable = false, length = 100)
	private String educationStatus;
	
	
	@Column(name= "province", nullable = false, length = 100)
	private String province;
	
	
	@Column(name= "district", nullable = false, length = 100)
	private String district;
	
	
	@Column(name= "military_status", nullable = false, length = 100)
	private String militaryStatus;
	
	
	@Column(name= "language", nullable = false, length = 100)
	private String language;
	
	
	@Column(name= "programming_language", nullable = false, length = 100)
	private String programmingLanguage;
	
	@Column(name= "hobbies", nullable = false, length = 100)
	private String hobbies;
	
	
	@Column(name= "certificates", nullable = false, length = 100)
	private String certificates;
	
	
	@Column(name= "create_time", nullable= false)
	private LocalDateTime createTime;
	
	
}
