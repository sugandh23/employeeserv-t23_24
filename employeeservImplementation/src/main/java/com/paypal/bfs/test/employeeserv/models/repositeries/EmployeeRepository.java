package com.paypal.bfs.test.employeeserv.models.repositeries;

import com.paypal.bfs.test.employeeserv.models.EmployeeDB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDB, Integer> {
}
