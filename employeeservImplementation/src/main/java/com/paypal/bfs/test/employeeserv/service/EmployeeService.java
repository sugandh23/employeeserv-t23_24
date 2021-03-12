package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.exceptions.ResponseException;
import com.paypal.bfs.test.employeeserv.mapper.EmployeeMapper;
import com.paypal.bfs.test.employeeserv.mapper.EmployeeMapping;
import com.paypal.bfs.test.employeeserv.models.EmployeeDB;
import com.paypal.bfs.test.employeeserv.models.repositeries.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapping employeeMapping;

    @Autowired
    private EmployeeValidationService employeeValidationService;

    public Employee getEmployeeById(String id) {
        Optional<EmployeeDB> employeeDB = employeeRepository.findById(Integer.valueOf(id));
        if (employeeDB.isPresent()) {
            Employee employee = employeeMapping.toEmployeeDB(employeeDB.get());
            return employee;
        }
        return null;
    }

    public ResponseEntity createEmployeeEntry(Employee employee) {
        if (checkIfEmployeeIsAlreadyExisting(employee)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Employee Exists!");
        }
        Optional<List<ResponseException>> error = employeeValidationService.getResponseException(employee);
        if (error.isPresent()) {
            return new ResponseEntity(error.get(), HttpStatus.BAD_REQUEST);
        }
        try {
            EmployeeDB employeeDB = employeeMapping.toEmployee(employee);
            employeeRepository.save(employeeDB);
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    private boolean checkIfEmployeeIsAlreadyExisting(Employee employee) {
        return getEmployeeById(employee.getId().toString()) == null ? false : true;
    }
}
