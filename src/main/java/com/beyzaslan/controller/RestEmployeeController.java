package com.beyzaslan.controller;

import com.beyzaslan.model.Employee;
import com.beyzaslan.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//controller katmanı olduğunu belirtmek için bu anotasyonu yaz
@RequestMapping("/rest/api")//Dışarıdan gelen adreslerde kök adresini yazar yani bütün metotların adından once rest/api/bilmem ne ...
public class RestEmployeeController {

    @Autowired//diyo ki controllerden EmployeeService adındaki sınıfına enjekte yapcaz
    private EmployeeService employeeService;

    //Buraya dışarıdan istek atıldığını göstermem lazım
    @GetMapping(path = "/employee-list")//burda senden bir path istiyor
    public List<Employee> getAllEmployeeList() {
        employeeService.getAllEmployeeList();//Autowiredde yazdıgımız services sınıfının bu memtoduna yönlendir diyoz
        return employeeService.getAllEmployeeList();
    }
    //bütün işçiler bu listede tanımlı
    //dışarıdan gönderilen istek bu classta birden fazla metot varsa hangi metoda ait olduğunu gösterdiğini @GetMapping anotasyonuyla yazıcaz.
}
//controller isteği alır