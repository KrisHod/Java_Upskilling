package com.fdmgroup.solidExercises;

import java.util.ArrayList;
import java.util.List;

public class Employee implements EmployeeManagement {
    private int employeeId;
    private String employeeName;
    private double salary;
    
    public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
    public void addEmployee(Employee employee) {
        // Add employee logic
    }
    
    @Override
    public void removeEmployee(int employeeId) {
        // Remove employee logic
    }
    
    @Override
    public void updateEmployee(Employee employee) {
        // Update employee logic
    }
    
    @Override
    public List<Employee> listEmployees() {
        return new ArrayList<>();
    }
}
