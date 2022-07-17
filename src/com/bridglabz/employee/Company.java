package com.bridglabz.employee;

import static java.lang.Math.random;

public class Company {


    final static int NOT_WORKING=0;
    final static int FULL_TIME=1;
    final static int PART_TIME=2;

    int WAGE_PER_HOUR;
    int FULL_DAY_HOUR;
    int PART_TIME_HOUR;
    int NO_OF_WORKING_DAYS;

    String name;

    Company(String name)
    {
        this.name=name;
    }

    public void setWagePerHour(int WAGE_PER_HOUR) {
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
    }

    public void setFullDayHour(int FULL_DAY_HOUR) {
        this.FULL_DAY_HOUR = FULL_DAY_HOUR;
    }

    public void setPartTimeHour(int PART_TIME_HOUR) {
        this.PART_TIME_HOUR = PART_TIME_HOUR;
    }

    public void setNoOfWorkingDays(int NO_OF_WORKING_DAYS) {
        this.NO_OF_WORKING_DAYS = NO_OF_WORKING_DAYS;
    }

    public void calEmpWagePerMonth(){
        System.out.println("--------------------------------------");
        System.out.println(this.name);
        System.out.println("--------------------------------------");
        int dailyEmpWage=0;
        int workingHours = 0;
        int totalHours=0;
        int totalWage=0;

        System.out.println("Day\tMode\tWage");

        int day =1;
        while (day <= NO_OF_WORKING_DAYS && totalHours <= 100)
        {
            int employeeWorkingMode = (int) Math.round(random()*2);

            System.out.print(day+"\t");
            switch (employeeWorkingMode) {
                case FULL_TIME:
                    dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    workingHours = FULL_DAY_HOUR;
                    System.out.print("FULL\t");
                    break;
                case PART_TIME:
                    dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    workingHours = PART_TIME_HOUR;
                    System.out.print("PART\t");
                    break;
                case NOT_WORKING:
                    dailyEmpWage=0;
                    workingHours=0;
                    System.out.print("ABSENT\t");
            }
            totalWage = totalWage + dailyEmpWage;
            totalHours = totalHours + workingHours;
            day++;
            System.out.print(dailyEmpWage+"\t");
            System.out.println();
        }
        System.out.println("total employee wage is: Rs: "+totalWage);
    }
}
