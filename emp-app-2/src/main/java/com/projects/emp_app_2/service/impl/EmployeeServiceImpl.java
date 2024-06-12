package com.projects.emp_app_2.service.impl;

import org.springframework.stereotype.Service;

import com.projects.emp_app_2.entity.Employee;
import com.projects.emp_app_2.exception.ResourceNotFoundException;
import com.projects.emp_app_2.mapper.EmployeeMapper;
import com.projects.emp_app_2.repository.EmployeeRepository;
import com.projects.emp_app_2.service.EmployeeService;
import com.projects.ems_kafka.dto.EmployeeDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
		
		 System.out.println("in here");  
		
		Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
		Employee savedEmployee = employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
	}

	
	@Override
	public EmployeeDTO getEmployee(Long employeeId) {
		
		Employee employee = employeeRepository.findById(employeeId)
		.orElseThrow(()-> new ResourceNotFoundException("Employee does not exist for the given id:" + employeeId));
		
		return EmployeeMapper.mapToEmployeeDTO(employee);
	}
	
}
