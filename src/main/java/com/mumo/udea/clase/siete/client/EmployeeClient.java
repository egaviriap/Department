package com.mumo.udea.clase.siete.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mumo.udea.clase.siete.model.Employee;

@FeignClient(value = "employee-service")
public interface EmployeeClient {

	@GetMapping("/employees/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
