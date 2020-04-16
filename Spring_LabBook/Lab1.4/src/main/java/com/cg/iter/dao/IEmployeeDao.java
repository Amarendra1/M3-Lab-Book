package com.cg.iter.dao;

import java.util.List;

import com.cg.iter.entities.Employee;

public interface IEmployeeDao {

    List<Employee>fetchAllEmployees();
}
