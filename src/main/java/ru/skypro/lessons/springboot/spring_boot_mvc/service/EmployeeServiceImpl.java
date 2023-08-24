package ru.skypro.lessons.springboot.spring_boot_mvc.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.spring_boot_mvc.pojo.Employee;
import ru.skypro.lessons.springboot.spring_boot_mvc.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
    @Override
    public double getSumSalary(){
        return employeeRepository.getSumSalary();
    }
    @Override
    public Employee getMaxSalary(){
        return employeeRepository.getMaxSalary();
    }
    @Override
    public Employee getMinSalary(){
        return employeeRepository.getMinSalary();
    }
    @Override
    public List<Employee> getAboveAveragePaidEmployee(){
        return employeeRepository.getAboveAveragePaidEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }
    @Override
    public Employee changeEmployee(Employee employee, int id) {
        return employeeRepository.changeEmployee(employee, id);
    }
    @Override
    public Employee getEmployeeWithId(int id) {
        return employeeRepository.getEmployeeWithId(id);
    }
    @Override
    public Employee deleteEmployeeWithId(int id) {
        return employeeRepository.deleteEmployeeWithId(id);
    }

    @Override
    public List<Employee> getEmployeesWithHigherSalaries(double salary) {
        return employeeRepository.getEmployeesWithHigherSalaries(salary);
    }
}