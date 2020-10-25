package com.selimhorri.app.pack.services;

import java.util.List;

import com.selimhorri.app.pack.models.dto.BossEmployeeDTO;
import com.selimhorri.app.pack.models.entities.Employee;

public interface EmployeeService {
	
	public abstract List<Employee> findAll();
	public abstract BossEmployeeDTO getBoss();
	
}









