package com.beyzaslan.services;

import com.beyzaslan.model.Employee;
import com.beyzaslan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        employeeRepository.getAllEmployeeList();
        return employeeRepository.getAllEmployeeList();
    }
}


//service isteği kontrol eder , hatalara bakar