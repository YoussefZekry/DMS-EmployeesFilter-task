package com.dms.EmployeesFilter.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.dms.EmployeesFilter.dtos.EmployeesDto;
import com.dms.EmployeesFilter.models.Employees;

@Mapper(componentModel = "spring")
public interface EmployeesMapper {
	Employees map (EmployeesDto employeesDto);
	EmployeesDto map (Employees employees);
	List<EmployeesDto> map(List<Employees> employees);
}
