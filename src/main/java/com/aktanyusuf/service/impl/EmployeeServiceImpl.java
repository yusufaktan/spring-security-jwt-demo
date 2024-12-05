package com.aktanyusuf.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aktanyusuf.dto.DtoDepartment;
import com.aktanyusuf.dto.DtoEmployee;
import com.aktanyusuf.model.Department;
import com.aktanyusuf.model.Employee;
import com.aktanyusuf.repository.EmployeeRepository;
import com.aktanyusuf.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository ; 

	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee  =new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isEmpty()) {
			//Exception
			return null;
		}
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		return dtoEmployee;
	}

}
