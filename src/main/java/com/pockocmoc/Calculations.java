package com.pockocmoc;

import java.util.List;

public class Calculations {

    public void addSalary(List<Employee> employees) {
        for (Employee emp :
                employees) {
            if (emp.getAge() >= 45) {
                emp.setSalary(emp.getSalary() + 5000);
            }
        }
    }

    public double averageAge(List<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        return sum / employees.size();
    }

    public double averageSalary(List<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }
}
