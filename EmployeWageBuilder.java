package employewage;

import java.util.Random;
/**
 * @author Sreekanth
 * 
 * Purpose -  To calculate the daily wage of an Employee using Switch-Case
 */
public class EmployeWageBuilder {
	
	  // Declaring a constant
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;
    public static final int Emp_Rate_PerHr = 20;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        // Declaring a variables
        int empHrs = 0;
        int empWage = 0;
        /*
         * Using random method to generate random numbers 0, 1 and 2
         */
        Random random = new Random();
        int empCheck = random.nextInt(3);
        switch (empCheck) {
            case IS_FULLTIME: // FullTime Employee
                empHrs = 8;
                break;
            case IS_PARTTIME: // PartTime Employee
                empHrs = 4;
                break;
            default: // Employee is absent
                empHrs = 0;
        }
        /*
         * Calculating the daily employee wage of an employee
         */
        empWage = Emp_Rate_PerHr * empHrs;
        System.out.println("The daily wage of an employee is : " + empWage);
    }
}
