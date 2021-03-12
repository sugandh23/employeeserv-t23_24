package com.paypal.bfs.test.employeeserv.mapper;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.models.EmployeeDB;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee toEmployeeDBDto(EmployeeDB newEmployeeDB);

    EmployeeDB toEmployeeDto(Employee newEmployee);

}
