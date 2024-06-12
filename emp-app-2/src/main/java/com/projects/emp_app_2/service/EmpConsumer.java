package com.projects.emp_app_2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.projects.ems_kafka.dto.EmployeeDTO;

import lombok.AllArgsConstructor;
//import com.projects.emp_app_2.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmpConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmpConsumer.class);

	private EmployeeService employeeService;

	@KafkaListener(topics = "emp-topic", groupId = "empGroup")
	public void consume(EmployeeDTO employeeDTO) {

		System.out.println("I am in consumer");
		System.out.println(employeeService);
		employeeService.createEmployee(employeeDTO);
		
		LOGGER.info(String.format("Message received %s", employeeDTO.getFirstName()));
		

	}

}
