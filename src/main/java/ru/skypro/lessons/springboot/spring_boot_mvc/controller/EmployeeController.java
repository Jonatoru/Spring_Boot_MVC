package ru.skypro.lessons.springboot.spring_boot_mvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;
import ru.skypro.lessons.springboot.spring_boot_mvc.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

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
    @PostMapping("/")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @PutMapping("/{id}")
    public Employee changeEmployee(@RequestBody Employee employee, @PathVariable int id){
        return employeeService.changeEmployee(employee,id);
    }
    @GetMapping("/{id}")
    public Employee getEmployeeWithId (@PathVariable int id){
        return employeeService.getEmployeeWithId(id);
    }
    @DeleteMapping("/{id}")
    public Employee deleteEmployeeWithId (@PathVariable int id){
        return  employeeService.deleteEmployeeWithId(id);
    }
    @GetMapping("/salaryHigherThan")
    public List<Employee> getEmployeesWithHigherSalaries(@RequestParam("salary") double salary){
        return employeeService.getEmployeesWithHigherSalaries(salary);
    }
}