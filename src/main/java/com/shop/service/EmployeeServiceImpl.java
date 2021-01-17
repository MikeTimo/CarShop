package com.shop.service;

import com.shop.exception.BadRequestException;
import com.shop.model.workers.Employee;
import com.shop.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            return employeeRepository.findById(id).get();
        } else {
            throw new BadRequestException("Неправильный ID");
        }
    }

    @Override
    public void deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        } else {
            throw new BadRequestException("Неправильный ID");
        }
    }

    @Override
    public void updateEmployee(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.save(employee);
        } else {
            throw new BadRequestException("Неверный ID");
        }
    }
}
