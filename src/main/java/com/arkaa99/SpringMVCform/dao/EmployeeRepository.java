package com.arkaa99.SpringMVCform.dao;

import com.arkaa99.SpringMVCform.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
