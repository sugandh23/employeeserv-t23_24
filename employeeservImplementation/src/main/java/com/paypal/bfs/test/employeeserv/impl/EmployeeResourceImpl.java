package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {

        Employee employee = employeeService.getEmployeeById(id);
        if (ObjectUtils.isEmpty(employee)) {
            return new ResponseEntity<>(employee, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Override
    public ResponseEntity createEmployee(@Valid Employee employee) {
        return employeeService.createEmployeeEntry(employee);
    }
}
