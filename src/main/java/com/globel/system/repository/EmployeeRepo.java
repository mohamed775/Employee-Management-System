package com.globel.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globel.system.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
