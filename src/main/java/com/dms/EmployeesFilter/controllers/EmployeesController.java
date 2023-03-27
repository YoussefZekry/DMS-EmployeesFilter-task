package com.dms.EmployeesFilter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dms.EmployeesFilter.dtos.EmployeesDto;
import com.dms.EmployeesFilter.services.EmployeesService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = { RequestMethod.POST })
public class EmployeesController {
	@Autowired
	private EmployeesService employeesService;

	@PostMapping
	public ResponseEntity<List<EmployeesDto>> findAll(@RequestBody EmployeesDto employeesDto){
		List<EmployeesDto> all = employeesService.employeesFilter(employeesDto);
		return ResponseEntity.ok().body(all);
	}
}
