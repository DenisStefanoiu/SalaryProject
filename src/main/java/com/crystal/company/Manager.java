package com.crystal.company;
import java.util.ArrayList;


public class Manager extends Company {
    String name;
    float salary;
    double bonus;
    ArrayList<Company> companyEmployees = new ArrayList<>();


    public Manager(String name, float salary, double bonus)
    {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

   public void employeeToAdd(Company employee){
        companyEmployees.add(employee);
   }

    public String getName() {
        return this.name;
    }

    public double employeeSalary(){
        double salaryEmployee = 0;
        for(Company employee : companyEmployees){
            salaryEmployee = salaryEmployee + employee.employeeSalary();
        }
        double resultManager = salary * bonus /100 + salaryEmployee;
        return  resultManager;
    }

}
