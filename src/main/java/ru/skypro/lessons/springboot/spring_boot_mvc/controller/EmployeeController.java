package ru.skypro.lessons.springboot.spring_boot_mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;
import ru.skypro.lessons.springboot.spring_boot_mvc.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/salary/sum")
    public double getSumSalary(){
        return employeeService.getSumSalary();
    }
    @GetMapping("/salary/max")
    public Employee getMaxSalary(){
        return employeeService.getMaxSalary();
    }
    @GetMapping("/salary/min")
    public Employee getMinSalary(){
        return employeeService.getMinSalary();
    }
    @GetMapping("/high-salary")
    public List<Employee> getAboveAveragePaidEmployee(){
        return employeeService.getAboveAveragePaidEmployee();
    }
}