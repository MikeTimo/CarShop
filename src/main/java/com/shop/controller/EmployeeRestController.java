package com.shop.controller;

import com.shop.model.workers.Employee;
import com.shop.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {
    private EmployeeService employeeService;
    private static final Logger log = LoggerFactory.getLogger(EmployeeRestController.class);

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/count")
    @ResponseStatus(HttpStatus.OK)
    public Integer getCountEmployees() {
        return employeeService.getAllEmployees().size();
    }

    @PostMapping("employees")
    @ResponseStatus(HttpStatus.OK)
    public Employee addNewEmployees(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @PutMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
