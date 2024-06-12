package com.projects.emp_app_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.emp_app_2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
