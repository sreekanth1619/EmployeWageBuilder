package employewage;

import java.util.Random;
/**
 * @author Sreekanth
 * 
 * Purpose -Calculating wages for a total of working hours of 100 or max days of 20 in a month
 */
public class EmployeWageBuilder {
	 // Declaring a constant
	 public static final int IS_FULLTIME = 1;
	    public static final int IS_PARTTIME = 2;

	    /* Using static method by passing the 4 argument so that we can call it in static main
	       If we have not used static in method here then we have to create an object inside
	       the main for calling the method.
	     */
	    public static int computeWage(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
	        // Declaring the variables
	        int empHrs = 0;
	        int empWage = 0;
	        int totalEmpWage = 0;
	        int totalEmpHrs = 0;
	        int totalWorkingDays = 0;
	        /*
	         * Using random method to generate random numbers 0, 1 and 2
	         */
	        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
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
	                default:  // Employee is absent
	                    empHrs = 0;
	            }
	            empWage = empRatePerHour * empHrs;
	            totalEmpHrs += empHrs;
	            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours " +
	                                ", Employee Wage : " + empWage );
	        }
	        totalEmpWage = totalEmpHrs * empRatePerHour;
	        System.out.println("Total Wages of an employee in " +companyName + " company is : " + totalEmpWage + "\n");
	        return totalEmpWage;
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome To Employee Wage Computation Program");
	        computeWage("TCS" , 200, 3, 10) ;
	        computeWage("Accenture", 100, 4, 12);
	        computeWage("Infosys", 150, 2, 10);
	    }
}
