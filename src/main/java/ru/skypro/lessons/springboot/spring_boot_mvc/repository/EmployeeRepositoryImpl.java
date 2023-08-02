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
        double maxSalary = employeeList.get(0).getSalary();
        Employee employee = null;
        for (int i = 0; i < employeeList.size(); i++){
            maxSalary = Math.max(maxSalary, employeeList.get(i).getSalary());

            if (employeeList.get(i).getSalary() == maxSalary) {
                    employee= employeeList.get(i);
            }
        }
        return employee;
    }
    @Override
    public Employee getMinSalary(){
        double minSalary = employeeList.get(0).getSalary();
        Employee employee = null;
        for (int i = 0; i < employeeList.size(); i++){
            minSalary = Math.min(minSalary,employeeList.get(i).getSalary());

            if (employeeList.get(i).getSalary() == minSalary) {
                employee= employeeList.get(i);
            }
        }
        return employee;
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