package com.designpattern.learningdesignpattern.structural.FacadePattern.Solution1WithFacadePattern;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        this.employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insert();
    }

    public Employee getEmployeeDetails(int employeeId) {
        return employeeDAO.getEmployeeDetails(employeeId);
    }
}
