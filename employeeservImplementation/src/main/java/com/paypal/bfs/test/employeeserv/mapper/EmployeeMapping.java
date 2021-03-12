package com.paypal.bfs.test.employeeserv.mapper;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.models.EmployeeDB;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapping {
    public EmployeeDB toEmployee(Employee employee) {
        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.setFirst_name(employee.getFirstName());
        employeeDB.setLast_name(employee.getLastName());
        employeeDB.setDate_of_birth(employee.getDateOfBirth());
        employeeDB.setAddress1(employee.getAddress1());
        employeeDB.setAddress2(employee.getAddress2());
        employeeDB.setCity(employee.getCity());
        employeeDB.setState(employee.getState());
        employeeDB.setZip_code(employee.getZipCode());
        employeeDB.setCountry(employee.getCountry());
        return employeeDB;
    }

    public Employee toEmployeeDB(EmployeeDB employeeDB) {
        Employee employee = new Employee();
        employee.setId(Integer.valueOf(employeeDB.getId()));
        employee.setFirstName(employeeDB.getFirst_name());
        employee.setLastName(employeeDB.getLast_name());
        employee.setDateOfBirth(employeeDB.getDate_of_birth());
        employee.setAddress1(employeeDB.getAddress1());
        employee.setAddress2(employeeDB.getAddress2());
        employee.setCity(employeeDB.getCity());
        employee.setState(employeeDB.getState());
        employee.setZipCode(employeeDB.getZip_code());
        employee.setCountry(employeeDB.getCountry());
        return employee;

    }
}
