package com.projects.ems_kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	
	Long employeeId;
	String firstName;
	String lastName;
	String companyName;
	String workLocation;
	String email;
	String gender;
	Integer salary_1;
	Integer salary_2;
	Integer salary_3;
	

}
