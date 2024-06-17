package com.springboot.ems.service;

import com.springboot.ems.entity.Employee;
import com.springboot.ems.exception.EmployeeNotFoundException;
import com.springboot.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found for this id :: " + id));
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found for this id :: " + id));
        employeeRepository.deleteById(id);
    }
}
