package com.bridglabz.employee;

import static java.lang.Math.random;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Company company1 = new Company("HURC private Ltd.");
        company1.setNoOfWorkingDays(20);
        company1.setWagePerHour(100);
        company1.setFullDayHour(8);
        company1.setPartTimeHour(4);

        company1.calEmpWagePerMonth();



        Company company2 = new Company("Intel Corporation");

        company2.setNoOfWorkingDays(25);
        company2.setWagePerHour(200);
        company2.setFullDayHour(9);
        company2.setPartTimeHour(5);

        company2.calEmpWagePerMonth();


        Company company3 = new Company("Google Corporation");

        company3.setNoOfWorkingDays(22);
        company3.setWagePerHour(400);
        company3.setFullDayHour(7);
        company3.setPartTimeHour(4);

        company3.calEmpWagePerMonth();
    }
}
