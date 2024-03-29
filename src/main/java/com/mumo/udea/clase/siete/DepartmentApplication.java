package com.mumo.udea.clase.siete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.mumo.udea.clase.siete.model.Department;
import com.mumo.udea.clase.siete.repository.DepartmentRepository;
import com.mumo.udea.clase.siete.repository.DepartmentRepositoryImpl;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentApplication.class, args);
	}

	@Bean
	DepartmentRepository repository() {
		DepartmentRepository repository = new DepartmentRepositoryImpl();
		repository.add(new Department(1L, "Development"));
		repository.add(new Department(1L, "Operations"));
		repository.add(new Department(2L, "Development"));
		repository.add(new Department(2L, "Operations"));		
		return repository;
	}
}
