package com.aktanyusuf.service;

import com.aktanyusuf.dto.DtoEmployee;

public interface IEmployeeService {

	DtoEmployee findEmployeeById(Long id);
}
