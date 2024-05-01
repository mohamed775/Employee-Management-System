package com.globel.system.service;

import com.globel.system.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto  createEmployee (EmployeeDto employeeDto);
	
	EmployeeDto  getEmployeeById (Long id);

	
}
