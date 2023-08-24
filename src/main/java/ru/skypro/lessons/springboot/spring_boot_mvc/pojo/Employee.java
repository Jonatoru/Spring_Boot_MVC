package ru.skypro.lessons.springboot.spring_boot_mvc.pojo;

public class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(int id,String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
    }
}