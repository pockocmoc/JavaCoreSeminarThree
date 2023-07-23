package com.pockocmoc;


import java.util.List;

public class Employee {
    private String surname;
    private String post;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String surname, String post,
                    String phoneNumber, int salary, int age) {
        this.surname = surname;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void increaseSalary(List<Employee> employees) {
        for (Employee emp :
                employees) {
            if (emp.getAge() >= 45) {
                emp.setSalary(emp.getSalary() + 5000);
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", post='" + post + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
