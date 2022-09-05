package com.demo.EmployeeService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EmployeeService.entity.EmployeeEntity;
import com.demo.EmployeeService.services.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	public EmployeeServices employeeServices;
	
	
	@GetMapping("/")
	public List<EmployeeEntity> getEmployee() {
          return employeeServices.getEmployee();
	}

	@PostMapping("/")
	public void addEmployee(@RequestBody EmployeeEntity emp) {
		employeeServices.addEmployee(emp);
	}
    
	@PutMapping("/")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity emp) {
		return updateEmployee(emp);
	}

	@DeleteMapping("/")
	public void deleteEmployee(long id) {
		deleteEmployee(id);
	}

}