package com.crystal.company;


public class Main {
    public static void main(String[] args) {
        Seller Susan = new Seller("Susan",500,10,17000);

        Seller Sam = new Seller("Sam", 500, 10, 15000);

        Technician Teresa = new Technician("Teresa",1400);

        Manager Matt = new Manager("Matt",1500,0.5);

        Matt.employeeToAdd(Teresa);

        Matt.employeeToAdd(Sam);

        Manager Maria = new Manager("Maria", 1500,0.5);

        Maria.employeeToAdd(Susan);

        Maria.employeeToAdd(Matt);

        System.out.println("Salary of " + Susan.getName() + " is: " + Susan.employeeSalary());

        System.out.println("Salary of " + Sam.getName() + " is: " + Sam.employeeSalary());
        System.out.println("Salary of " + Teresa.getName() + " is: " + Teresa.employeeSalary());
        System.out.println("Salary of " + Matt.getName() + " is: " + Matt.employeeSalary());
        System.out.println("Salary of " + Maria.getName() + " is: " + Maria.employeeSalary());

        System.out.println(" ");

        double Total = Susan.employeeSalary() + Sam.employeeSalary() + Teresa.employeeSalary() + Matt.employeeSalary() + Maria.employeeSalary();
        System.out.println("The total is: " + Total);


    }
}
