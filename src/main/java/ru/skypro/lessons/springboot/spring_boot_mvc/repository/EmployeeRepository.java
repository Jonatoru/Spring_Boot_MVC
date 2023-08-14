package ru.skypro.lessons.springboot.spring_boot_mvc.repository;

import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
    public double getSumSalary();
    public Employee getMaxSalary();
    Employee getMinSalary();
    public List<Employee> getAboveAveragePaidEmployee();
}