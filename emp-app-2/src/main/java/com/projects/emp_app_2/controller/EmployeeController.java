package com.projects.emp_app_2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.emp_app_2.service.EmployeeService;
import com.projects.ems_kafka.dto.EmployeeDTO;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v2/employees")
@AllArgsConstructor
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@GetMapping("{id}")
	ResponseEntity<EmployeeDTO> getEmployee(@PathVariable("id") Long employeeId){
		
		System.out.println(employeeService);
		
		EmployeeDTO savedEmpployeeDTO = employeeService.getEmployee(employeeId);
		
		return ResponseEntity.ok(savedEmpployeeDTO);
	}
	

}
