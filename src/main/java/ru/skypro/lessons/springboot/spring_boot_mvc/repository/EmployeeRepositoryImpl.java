package ru.skypro.lessons.springboot.spring_boot_mvc.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;

import java.util.Comparator;
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
        double sumSalary = employeeList.stream().map(x -> x.getSalary()).reduce(0.0,Double::sum);
        return sumSalary;
    }
    @Override
    public Employee getMaxSalary(){
        Employee employeeMax = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        return employeeMax;
    }
    @Override
    public Employee getMinSalary(){
       Employee employeeMin = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
       return employeeMin;
    }
    @Override
    public List<Employee> getAboveAveragePaidEmployee(){
        double averageSalary = getSumSalary()/ employeeList.size();
        List <Employee> AboveAveragePaidEmployee = employeeList.stream().filter(employee -> employee.getSalary()>=averageSalary).toList();
        return AboveAveragePaidEmployee;
    }
}