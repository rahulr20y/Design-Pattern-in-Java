package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution1WithFacadePattern;

public class EmployeeDAO {
    public void insert() {
        // insert into Employee Table
    }

    public void updateEmployeeName() {
        // update employee name
    }

    public Employee getEmployeeDetails(String emailId) {
        // get Employee details based on emailId;
        return new Employee();
    }

    public Employee getEmployeeDetails(int employeeId) {
        // get Employee details based on employeeId;
        return new Employee();
    }
}
