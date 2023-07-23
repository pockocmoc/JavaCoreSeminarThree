package com.pockocmoc;

import java.util.List;

public class Manager extends Employee{
    public Manager(String surname, String post, String phoneNumber, int salary, int age) {
        super(surname, post, phoneNumber, salary, age);
    }
    public static void increaseSalaryManager(List<Employee> employees) {
        for (Employee emp :
                employees) {
            if (emp.getAge() >= 45 && !(emp instanceof Manager)) {
                emp.setSalary(emp.getSalary() + 5000);
            }
        }
    }
}
