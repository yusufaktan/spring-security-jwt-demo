package com.aktanyusuf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aktanyusuf.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
