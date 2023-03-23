package com.dms.EmployeesFilter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.EmployeesFilter.dtos.EmployeesDto;
import com.dms.EmployeesFilter.mappers.EmployeesMapper;
import com.dms.EmployeesFilter.models.Employees;
import com.dms.EmployeesFilter.repositories.EmployeesRepository;

@Service
public class EmployeesService {
	@Autowired
	private EmployeesRepository employeesRepository;
	@Autowired
	private EmployeesMapper employeesMapper;

	// public List<EmployeesDto> emplyeesFilter(EmployeesDto employeesDto){
	// 	List<Employees> employees = employeesRepository.emplyeesFilter(employeesDto);
	// 	return employeesMapper.map(employees);
	// }

	public List<EmployeesDto> findAll(){
		List<Employees> employees = employeesRepository.findAll();
		List<EmployeesDto> allDto = employeesMapper.map(employees);
		return allDto;
	}
}
