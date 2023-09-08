package com.crystal.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class Tests {
        Seller Sam, Susan;
        Technician Teresa;
        Manager Matt, Maria;

    @Before
    public void init(){

        Seller Susan = new Seller("Susan",500,10,17000);

        Manager Matt = new Manager("Matt",1500,0.5);

        Matt.employeeToAdd(Teresa);

        Matt.employeeToAdd(Sam);

        Manager Maria = new Manager("Maria", 1500,0.5);

        Maria.employeeToAdd(Susan);

        Maria.employeeToAdd(Matt);
    }

    @Test
    public void sellerSalary(){
        Seller Sam = new Seller("Sam", 500, 10, 15000);
        double actual = Sam.employeeSalary();
        assertEquals(2000.0, actual);
    }


    @Test
    public void technicianSalary() {
        Technician Teresa = new Technician("Teresa",1400);
        double actual = Teresa.employeeSalary();
        assertEquals(1400.0, actual);
    }


}

