package com.fdmgroup.solidExercises;

import java.util.List;

public interface EmployeeManagement {
    void addEmployee(Employee employee);
    void removeEmployee(int employeeId);
    void updateEmployee(Employee employee);
    List<Employee> listEmployees();
}


