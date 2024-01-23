package com.designpattern.learningdesignpattern.structural.ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, Employee employee) throws Exception {
        // create new row
        System.out.println("creates a new row in employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // deleting a row
        System.out.println("delete a row in employee table with id " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        // get a Employee from Employee table via a EmployeeId
        System.out.println("Fetching data from DB");
        return new Employee();
    }

}
