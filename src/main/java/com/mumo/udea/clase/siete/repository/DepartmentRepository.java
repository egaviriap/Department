package com.mumo.udea.clase.siete.repository;

import java.util.List;

import com.mumo.udea.clase.siete.model.Department;

public interface DepartmentRepository {

public Department add(Department department);
	
	public Department findById(Long id) ;
	
	public List<Department> findAll() ;
	
	public List<Department> findByOrganization(Long organizationId);
}
