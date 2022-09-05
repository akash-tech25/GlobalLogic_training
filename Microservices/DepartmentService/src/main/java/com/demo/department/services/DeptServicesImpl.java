package com.demo.department.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.department.entity.DeptEntity;
import com.demo.department.repo.DeptRepo;

@Service
public class DeptServicesImpl implements DeptServices {

	
	@Autowired
	DeptRepo repo;
	
	@Override
	public List<DeptEntity> getDept() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addDept(DeptEntity dept) {
		// TODO Auto-generated method stub
		repo.save(dept);
	}

	@Override
	public DeptEntity updateDept(DeptEntity dept) {
		// TODO Auto-generated method stub
		return repo.save(dept);
	}

	@Override
	public void deleteDepartment(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}