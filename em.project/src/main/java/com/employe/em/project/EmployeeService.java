package com.employe.em.project;

import java.util.List;

public interface EmployeeService {

    String createEmployee(Employee employee);

    List<Employee> readEmployees();

    boolean deleteEmployee(long id);

}
