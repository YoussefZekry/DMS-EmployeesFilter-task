package com.dms.EmployeesFilter.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeesDto {
	private Integer id;
	private Integer code;
	private String name;
	private Date birthDate;
	private String birthCity;
	private String department;
	private String jobTitle;
	private String directManager;
	private String contractType;
	private Boolean status;
}
