package com.demo.department.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.department.entity.DeptEntity;

@Service
public interface DeptServices {
	

	public List<DeptEntity> getDept();

	
	public void addDept( DeptEntity dept);
    

	public DeptEntity updateDept(DeptEntity dept);

	
	public void deleteDepartment(long id);

}