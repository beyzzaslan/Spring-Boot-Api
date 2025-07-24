package com.beyzaslan.controller;

import com.beyzaslan.model.Employee;
import com.beyzaslan.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//controller katmanı olduğunu belirtmek için bu anotasyonu yaz
@RequestMapping("/rest/api/employee")
//Dışarıdan gelen adreslerde kök adresini yazar yani bütün metotların adından once rest/api/bilmem ne ...
public class RestEmployeeController {

    @Autowired//diyo ki controllerden EmployeeService adındaki sınıfına enjekte yapcaz
    private EmployeeService employeeService;

    //Buraya dışarıdan istek atıldığını göstermem lazım
    @GetMapping(path = "/list")//burda senden bir path istiyor
    public List<Employee> getAllEmployeeList() {
        employeeService.getAllEmployeeList();//Autowiredde yazdıgımız services sınıfının bu memtoduna yönlendir diyoz
        return employeeService.getAllEmployeeList();
    }

    //bütün işçiler bu listede tanımlı
    //dışarıdan gönderilen istek bu classta birden fazla metot varsa hangi metoda ait olduğunu gösterdiğini @GetMapping anotasyonuyla yazıcaz.
    @GetMapping(path = "/list/{id}")    //id si şu olanı bana getir isteği oldugu için getmapping yazıyoruz
    public Employee getEmployeeGetById(@PathVariable(name = "id", required = true) String id) {

        return employeeService.getEmployeeGetById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName",required = false) String fistName,
                                                @RequestParam(name = "lastName",required = false) String lastName) {

        System.out.println(fistName + " " + lastName);
        return employeeService.getEmployeeWithParams(fistName,lastName);
    }


    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){
        return  employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping(path = "/delete-employee/{id}")
    //path Variableyi id si şu olanı bana getir ve sil anlamında kullanıcaz
    public boolean deleteEmployee(@PathVariable(name = "id") String id){
        return employeeService.deleteEmployee(id);
    }


}
//controller isteği alır