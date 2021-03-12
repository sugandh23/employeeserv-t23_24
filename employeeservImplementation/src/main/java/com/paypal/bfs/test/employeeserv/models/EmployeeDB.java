package com.paypal.bfs.test.employeeserv.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDB {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String zip_code;

}