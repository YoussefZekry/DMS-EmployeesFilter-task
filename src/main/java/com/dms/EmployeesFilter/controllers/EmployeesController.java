package com.dms.EmployeesFilter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dms.EmployeesFilter.dtos.EmployeesDto;
import com.dms.EmployeesFilter.models.Employees;
import com.dms.EmployeesFilter.services.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private EmployeesService employeesService;

	@GetMapping("/all")
	public ResponseEntity<List<Employees>> findAll(){
		List<Employees> all = employeesService.findAll();
		return ResponseEntity.ok().body(all);
	}
}
