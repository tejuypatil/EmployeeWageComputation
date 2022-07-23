package com.bridglabz.employee;

import static java.lang.Math.random;

public class EmpWageBuilder {
    final static int NOT_WORKING=0;
    final static int FULL_TIME=1;
    final static int PART_TIME=2;
    public String company;
    public int empRatePerHr;
    public int numOfWorkingDays;
    public int maxWorkingHrs;
    public EmpWageBuilder(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)
    {
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxWorkingHrs=maxWorkingHrs;
    }
    public void calEmpWagePerMonth() {
        int empHrs = 0;
        int totalEmpWage = 0;
        int empWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays <= numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case FULL_TIME:
                    empHrs = 8;
                    break;

                case PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Company: " + company + " Total Employee Wage: " + totalEmpWage);
    }

    }
