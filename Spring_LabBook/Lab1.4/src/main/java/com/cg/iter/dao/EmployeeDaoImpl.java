package com.cg.iter.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.iter.entities.Employee;

import java.util.*;

/**
 * @Repository is recommended instead of @Component on EmployeeDaoImpl to show intention
 * Both @Repository and @Component does same job
 */
@Repository
public class EmployeeDaoImpl implements IEmployeeDao{

    private Map<Integer,Employee>store=new HashMap<>();

    public EmployeeDaoImpl(){
        store.put(1,new Employee(1,"Vibhor"));
        store.put(2,new Employee(2,"Vj"));
    }


    @Override
    public List<Employee> fetchAllEmployees() {
        Collection<Employee>employees=store.values();
        List<Employee>list=new ArrayList<>(employees);
        return list;
    }
}
