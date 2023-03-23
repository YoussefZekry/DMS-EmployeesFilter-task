package com.dms.EmployeesFilter.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "employees",catalog = "employeesdb")
public class Employees {
	@Id
    @Column(unique = true,nullable = false)
    private int id ;

	@Column(name = "name")
    private String name ;

	@Column(name = "birth_date" )
	@Temporal(TemporalType.DATE)
    private Date birthDate ;

	@Column(name = "birth_city")
    private String birthCity ;

	@Column(name = "code")
    private int code ;

	@Column(name = "department")
    private String department ;

	@Column(name = "job_title")
    private String jobTitle ;

	@Column(name = "direct_manager")
    private String directManager ;

	@Column(name = "contract_type")
    private String contractType ;

	@Column(name = "status")
    private boolean status ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDirectManager() {
		return directManager;
	}

	public void setDirectManager(String directManager) {
		this.directManager = directManager;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}