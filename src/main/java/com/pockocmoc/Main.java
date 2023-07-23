package com.pockocmoc;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee empl1 = new Employee("Sabirov Marat",
                "Slesar", "+7(905)535-85-41", 55000, 40);
        Employee empl2 = new Employee("Sabirova Lilya",
                "Retoucher", "+7(926)408-09-32", 40000, 38);
        Employee empl3 = new Employee("Ivanov Egor",
                "HR", "+7(484)156-85-41", 10000, 22);
        Employee empl4 = new Employee("Petrova Mariya",
                "IT", "+7(988)222-88-41", 80000, 55);
        Employee empl5 = new Employee("Smirnov Anton",
                "Software", "+7(333)331-77-97", 150000, 30);
        Manager manager = new Manager("Letov Egor", "Manager",
                "+7(233)345-23-23)", 200_000, 50);



        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);
        employees.add(empl4);
        employees.add(empl5);
        employees.add(manager);

        System.out.println();
        System.out.println(employees);
        System.out.println();
        System.out.println("***************************************");
        System.out.println();


        Calculations calculations = new Calculations();

        /*
         calculations.addSalary(employees);
         System.out.println(employees);
        */


        /*
        System.out.println("***************************************");
        System.out.println();
        Employee.increaseSalary(employees);
        System.out.println(employees);

        */

        Manager.increaseSalaryManager(employees);

        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getSalary());
        }

        System.out.println("***************************************");
        System.out.println("Average age all employees: " + calculations.averageAge(employees));
        System.out.println();

        System.out.println("***************************************");
        System.out.println("Average salary all employees: " + calculations.averageSalary(employees));
        System.out.println();

    }
}
