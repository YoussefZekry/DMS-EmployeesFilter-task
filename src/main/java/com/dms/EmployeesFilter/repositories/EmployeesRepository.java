package com.dms.EmployeesFilter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.EmployeesFilter.models.Employees;

public interface EmployeesRepository extends JpaRepository<Employees,Integer>{
	
}
