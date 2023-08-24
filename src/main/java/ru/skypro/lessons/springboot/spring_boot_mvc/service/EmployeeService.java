package ru.skypro.lessons.springboot.spring_boot_mvc.service;

import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    double getSumSalary();
    Employee getMaxSalary();
    Employee getMinSalary();
    List<Employee> getAboveAveragePaidEmployee();
    void addEmployee(Employee employee);
    Employee changeEmployee(Employee employee, int id);
    Employee getEmployeeWithId (int id);
    Employee deleteEmployeeWithId (int id);
    List<Employee> getEmployeesWithHigherSalaries(double salary);
}