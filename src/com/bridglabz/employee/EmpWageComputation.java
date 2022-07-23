package com.bridglabz.employee;

import static java.lang.Math.random;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");


        EmpWageBuilder hcl = new EmpWageBuilder("HCL", 50, 20, 40);
        System.out.println("HCL");
        hcl.calEmpWagePerMonth();

        EmpWageBuilder intel = new EmpWageBuilder("Intel", 100, 15, 30);
        System.out.println("Intel");
        intel.calEmpWagePerMonth();

    }
}