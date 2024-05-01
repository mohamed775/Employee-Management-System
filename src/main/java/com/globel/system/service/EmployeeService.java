package com.globel.system.service;

import java.util.List;

import com.globel.system.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long id);
	
	EmployeeDto updateById(Long id ,EmployeeDto updateEmployee );

	List<EmployeeDto> getAllEmployee();
	
	void deleteEmployeeById(Long id);

}
