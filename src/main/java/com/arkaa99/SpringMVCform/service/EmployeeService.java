package com.arkaa99.SpringMVCform.service;

import com.arkaa99.SpringMVCform.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> findAll();
    public Optional<Employee> findById(Integer ID);
    public void save(Employee employee);
    public void deleteById(Integer ID);
}
