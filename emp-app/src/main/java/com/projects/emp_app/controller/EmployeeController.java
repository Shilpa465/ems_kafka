package com.projects.emp_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.emp_app.service.KafkaEmpProducer;
import com.projects.ems_kafka.dto.EmployeeDTO;


/**
 * @author shilpashelton
 * 
 *This Controller class exposes GET API to fetch data
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private KafkaEmpProducer kafkaEmpProducer;
	
	/**
	 * @param employeeDTO
	 * @return
	 */
	@PostMapping("/add")
	public ResponseEntity<String> getEmployee(@RequestBody EmployeeDTO employeeDTO){
		
		kafkaEmpProducer.sendMessage(employeeDTO);
		return ResponseEntity.ok("created");
		
	}
	

}
