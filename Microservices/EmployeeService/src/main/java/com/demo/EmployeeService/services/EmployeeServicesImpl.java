package com.demo.EmployeeService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.EmployeeService.entity.EmployeeEntity;
import com.demo.EmployeeService.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeRepository  employeeRepo;
	
	@Override
	public List<EmployeeEntity> getEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public void addEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		this.employeeRepo.save(emp);
	}

	@Override
	public void updateEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		employeeRepo.save(emp);
		
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

}