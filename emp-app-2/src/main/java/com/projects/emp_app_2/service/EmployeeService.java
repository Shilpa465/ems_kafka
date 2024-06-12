package com.projects.emp_app_2.service;

import com.projects.ems_kafka.dto.EmployeeDTO;

public interface EmployeeService {

	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	
	EmployeeDTO getEmployee(Long employeeId);
//	
//	List<EmployeeDTO> getAllEmployees();
//	
//	EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployeeDTO);
//	
//	void deleteEmployee(Long employeeId);
//	
}
