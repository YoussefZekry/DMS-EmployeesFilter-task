package com.dms.EmployeesFilter.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dms.EmployeesFilter.dtos.EmployeesDto;
import com.dms.EmployeesFilter.models.Employees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
public class EmployeesRepository {

	@Autowired
	private EntityManager entityManager;

	public List<Employees> employeesFilter(EmployeesDto employeesDTO){

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employees> criteriaQuery = criteriaBuilder.createQuery(Employees.class);
		List<Predicate> predicates = new ArrayList<>();

		//select * from employees
		Root<Employees> root = criteriaQuery.from(Employees.class);

        if (employeesDTO.getId() != null) {
			Predicate id = criteriaBuilder.equal(root.get("id"), employeesDTO.getId());
			predicates.add(id);
		}

		if(employeesDTO.getCode() != null){
			Predicate code = criteriaBuilder.equal(root.get("code"), employeesDTO.getCode());
			predicates.add(code);
		}

		if(employeesDTO.getName() != null) {
			Predicate name = criteriaBuilder.like(root.get("name"), "%" + employeesDTO.getName() + "%" );
			predicates.add(name);
		}

		if(employeesDTO.getBirthDate() != null) {
			Predicate birthDate = criteriaBuilder.equal(root.get("birth_date"), employeesDTO.getBirthDate());
			predicates.add(birthDate);
		}
		
		if(employeesDTO.getBirthCity() != null) {
			Predicate birthCity = criteriaBuilder.like(root.get("birth_city"), "%" + employeesDTO.getBirthCity() + "%" );
			predicates.add(birthCity);
		}

		if(employeesDTO.getDepartment() != null){
			Predicate department = criteriaBuilder.like(root.get("department"), "%" + employeesDTO.getDepartment() + "%" );
			predicates.add(department);
		}

		if(employeesDTO.getJobTitle() != null){
			Predicate jobTitle = criteriaBuilder.like(root.get("job_title"), "%" + employeesDTO.getJobTitle() + "%" );
			predicates.add(jobTitle);
		}
					
		if(employeesDTO.getDirectManager() != null){
			Predicate directManager = criteriaBuilder.like(root.get("direct_manager"), "%" + employeesDTO.getDirectManager() + "%" );
			predicates.add(directManager);
		}

		if(employeesDTO.getContractType() != null){
			Predicate contractType = criteriaBuilder.like(root.get("contract_type"), "%" + employeesDTO.getContractType() + "%" );
			predicates.add(contractType);
		}

		if(employeesDTO.getStatus() != null){
			Predicate status = criteriaBuilder.equal(root.get("status"), "%" + employeesDTO.getStatus() + "%" );
			predicates.add(status);	
		}

		criteriaQuery.where(criteriaBuilder.or(predicates.toArray(new Predicate[0])));
		TypedQuery<Employees> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}
}
