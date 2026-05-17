package com.employe.em.project;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {

    // EmployeeService employeeService = new EmployeeServiceImpl();
    // Dependcy Injection
    @Autowired
    EmployeeService employeeService;

    Employee emp = new Employee();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {

        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployees(@RequestBody Employee employee) {
        // employees.add(employee);
        return employeeService.createEmployee(employee);

    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployees(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id)) {
            return "Delete Succesfully";
        }
        return "Not found";
    }

}
