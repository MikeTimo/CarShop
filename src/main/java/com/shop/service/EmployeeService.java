package com.shop.service;

import com.shop.model.machine.Car;
import com.shop.model.workers.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployee(Long id);

    public void deleteEmployee(Long id);

    public void updateEmployee(Long id, Employee employee);
}
