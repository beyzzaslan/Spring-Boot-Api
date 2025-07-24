package com.beyzaslan.config;

import com.beyzaslan.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Beyzanur ", "Aslan"));
        employeeList.add(new Employee("2", "Ayşe ", "Kaya"));
        employeeList.add(new Employee("3", "Hilal ", "Gündüz"));
        employeeList.add(new Employee("4", "Mehdi ", "Feyza"));

        return employeeList;

    }
}
