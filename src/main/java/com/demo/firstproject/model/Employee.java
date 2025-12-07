package com.demo.firstproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name="employee")
public class Employee
{
    @Id
    @Column(name="emp_id")
    String empId;

    @Column(name="emp_name")
    String empName;

    @Column(name="salary")
    int salary;

    @Column(name="area_of_interest")
    String areaOfInterest;


    
}
