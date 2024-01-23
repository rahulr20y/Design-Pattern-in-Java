package com.designpattern.learningdesignpattern.structural.ProxyPattern;

public class EmployeeDaoImplProxy implements EmployeeDao {
    EmployeeDao employeeDaoObj;

    public EmployeeDaoImplProxy() {
        this.employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDaoObj.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDaoObj.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDaoObj.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }

}
