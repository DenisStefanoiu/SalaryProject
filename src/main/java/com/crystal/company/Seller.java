package com.crystal.company;

public class Seller extends Company {
    private String name;
    private float salary;
    private float bonus;
    private float amountSold;

    public Seller(String name, float salary,float bonus, float amountSold){
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.amountSold = amountSold;
    }
    public String getName() {
        return this.name;
    }

    public double employeeSalary(){
        float resultSeller = (amountSold * bonus) / 100 + salary;
        return resultSeller;
    }



}
