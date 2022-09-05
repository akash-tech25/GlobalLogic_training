package com.demo.EmployeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.EmployeeService.entity.EmployeeEntity;


@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Long> {

}
