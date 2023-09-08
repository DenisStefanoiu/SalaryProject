package com.crystal.company;

public class Technician extends Company {
    private  String name;
    private  double technicianSalary;


    public Technician(String name, float technicianSalary){
        this.name = name;
        this.technicianSalary = technicianSalary;
    }

    public double employeeSalary(){
        return technicianSalary;
    }

    public String getName() {
        return this.name;
    }

}
