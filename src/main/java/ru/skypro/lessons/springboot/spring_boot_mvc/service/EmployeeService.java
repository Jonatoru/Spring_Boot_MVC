package ru.skypro.lessons.springboot.spring_boot_mvc.service;

import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    double getSumSalary();
    Employee getMaxSalary();
    Employee getMinSalary();
    List<Employee> getAboveAveragePaidEmployee();
}