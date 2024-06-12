package com.projects.emp_app_2.mapper;


import com.projects.emp_app_2.entity.Employee;
import com.projects.ems_kafka.dto.EmployeeDTO;

public class EmployeeMapper {


	public static EmployeeDTO mapToEmployeeDTO(Employee employee) {
		return new EmployeeDTO(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getCompanyName(),
				employee.getGender(),
				employee.getWorkLocation(),
				employee.getSalaryYear1(),
				employee.getSalaryYear2(),
				employee.getSalaryYear3()
			);
	}
	
	public static Employee mapToEmployee(EmployeeDTO emplpoyeeDTO) {
		return new Employee(
				emplpoyeeDTO.getEmployeeId(),
				emplpoyeeDTO.getFirstName(),
				emplpoyeeDTO.getLastName(),
				emplpoyeeDTO.getEmail(),
				emplpoyeeDTO.getCompanyName(),
				emplpoyeeDTO.getWorkLocation(),
				emplpoyeeDTO.getGender(),
				emplpoyeeDTO.getSalary_1(),
				emplpoyeeDTO.getSalary_2(),
				emplpoyeeDTO.getSalary_3()
				);
	}
}
