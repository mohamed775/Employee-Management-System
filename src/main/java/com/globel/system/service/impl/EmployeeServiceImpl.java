package com.globel.system.service.impl;

import org.springframework.stereotype.Service;

import com.globel.system.dto.EmployeeDto;
import com.globel.system.entity.Employee;
import com.globel.system.exception.ResourceNotFoundException;
import com.globel.system.mapper.EmployeeMapper;
import com.globel.system.repository.EmployeeRepo;
import com.globel.system.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeeRepo;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepo.save(employee);
		return  EmployeeMapper.mapToEmployeeDto(savedEmployee) ;
		
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		Employee employee = employeeRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Employee is not found By id : " + id));
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

}
