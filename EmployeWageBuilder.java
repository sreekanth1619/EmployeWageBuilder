package employewage;

import java.util.Random;
/**
 * @author Sreekanth
 * 
 * Purpose - Calculating wages for a total of working hours of 100 or max days of 20 in a month
 */
public class EmployeWageBuilder {
	  // Declaring a constant
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;
    public static final int Emp_Rate_PerHr = 20;
    public static final int NO_WORKINGDAYS = 20;
    public static final int MAX_HRS_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        // Declaring a variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        /*
         * Using random method to generate random numbers 0, 1 and 2
         */
        while (totalEmpHrs <= MAX_HRS_MONTH && totalWorkingDays < NO_WORKINGDAYS) {
            totalWorkingDays++;
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
            empWage = Emp_Rate_PerHr * empHrs;
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours " +
                               ", Employee Wage : " + empWage);
        }
        totalEmpWage = totalEmpHrs * Emp_Rate_PerHr;
        System.out.println("Total Wages of an Employee is : " + totalEmpWage);
    }
}
