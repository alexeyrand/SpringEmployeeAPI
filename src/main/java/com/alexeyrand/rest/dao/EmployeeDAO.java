package com.alexeyrand.rest.dao;

import com.alexeyrand.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
