package com.projects.emp_app_2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name="work location")
	private String workLocation;
	
	@Column(name="gender")
	private String gender;

	@Column(name="salary_year_1")
	private Integer salaryYear1;
	
	@Column(name="salary_year_2")
	private Integer salaryYear2;
	
	@Column(name="salary_year_3")
	private Integer salaryYear3;

}
