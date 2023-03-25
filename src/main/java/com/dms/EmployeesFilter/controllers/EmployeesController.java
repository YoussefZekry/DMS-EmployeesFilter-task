package com.dms.EmployeesFilter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dms.EmployeesFilter.dtos.EmployeesDto;
import com.dms.EmployeesFilter.services.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private EmployeesService employeesService;

	@GetMapping
	public ResponseEntity<List<EmployeesDto>> findAll(@RequestBody EmployeesDto employeesDto){
		List<EmployeesDto> all = employeesService.employeesFilter(employeesDto);
		return ResponseEntity.ok().body(all);
	}
}
