package com.arkaa99.SpringMVCform.service;

import com.arkaa99.SpringMVCform.dao.EmployeeRepository;
import com.arkaa99.SpringMVCform.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImple implements EmployeeService{
    private EmployeeRepository employeeRepository;
   @Autowired
    public EmployeeServiceImple(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer ID) {
        return employeeRepository.findById(ID);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Integer ID) {
        employeeRepository.deleteById(ID);
    }
}
