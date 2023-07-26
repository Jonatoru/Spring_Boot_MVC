package ru.skypro.lessons.springboot.spring_boot_mvc.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000));
    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    @Override
    public double getSumSalary() {
        double SumSalary = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            SumSalary = SumSalary + employeeList.get(i).getSalary();
        }
        return SumSalary;
    }
    @Override
    public Employee getMaxSalary(){
        List <Employee> employeesMaxSalary = new ArrayList<>();
        double maxSalary = employeeList.get(0).getSalary();
        for (int i = 0; i < employeeList.size(); i++){
            maxSalary = Math.max(maxSalary, employeeList.get(i).getSalary());
        }
        for (int e = 0; e< employeeList.size(); e++) {
            if (employeeList.get(e).getSalary() == maxSalary) {
                employeesMaxSalary.add(employeeList.get(e));
            }
        }
        return employeesMaxSalary.get(0);
    }
    @Override
    public Employee getMinSalary(){
        List <Employee> employeesMinSalary = new ArrayList<>();
        double minSalary = employeeList.get(0).getSalary();
        for (int i = 0; i < employeeList.size(); i++){
            minSalary = Math.min(minSalary,employeeList.get(i).getSalary());
        }
        for (int e = 0; e< employeeList.size(); e++) {
            if (employeeList.get(e).getSalary() == minSalary) {
                employeesMinSalary.add(employeeList.get(e));
            }
        }
        return employeesMinSalary.get(0);
    }
    @Override
    public List<Employee> getAboveAveragePaidEmployee(){
        double averageSalary = getSumSalary()/ employeeList.size();
        List <Employee> AboveAveragePaidEmployee = new ArrayList<>();
        for (int i = 0; i< employeeList.size(); i++) {
            if (employeeList.get(i).getSalary() >= averageSalary) {
                AboveAveragePaidEmployee.add(employeeList.get(i));
            }
        }
        return AboveAveragePaidEmployee;
    }
}