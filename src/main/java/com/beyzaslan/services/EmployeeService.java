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
    //id yi alacak metot yazıcaz
    public Employee getEmployeeGetById(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String firstName , String lastName){
        return employeeRepository.getEmployeeWithParams(firstName,lastName);
    }
    public Employee saveEmployee(Employee newEmployee){
        return employeeRepository.saveEmployee(newEmployee);
    }
    public boolean deleteEmployee(String id){
        return employeeRepository.deleteEmployee(id);
    }

}


//service isteği kontrol eder , hatalara bakar