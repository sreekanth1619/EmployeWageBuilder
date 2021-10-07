package employewage;

import java.util.Random;
/**
 * @author Sreekanth
 ** Purpose-  Calculating Employee Wage for each company and saving it.
 */
 
public class EmployeWageBuilder {
	 // Declaring a constant
	 public static final int IS_FULLTIME = 1;
	    public static final int IS_PARTTIME = 2;

	    private final String companyName;
	    private final int empRatePerHour;
	    private final int noOfWorkingDays;
	    private final int maxHoursPerMonth;
	    private int totalEmpWage;

	   

		/*
	    I have created a constructor and passing the parameter inside it.
	    Also used this keyword for assigning the class value = parameter value.
	     */

	    public EmployeWageBuilder(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
	        this.companyName = companyName;
	        this.empRatePerHour = empRatePerHour;
	        this.noOfWorkingDays = noOfWorkingDays;
	        this.maxHoursPerMonth = maxHoursPerMonth;
	    }

	    /* Using static method by passing the 4 argument so that we can call it in static main
	       We have not used static in method here then we have to create an object inside
	       the main for calling this method.
	     */

	    public void computeWage() {
	        // Declaring the variables
	        int empHrs = 0;
	        int empWage = 0;
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
	    }

	    @Override
	    public String toString(){
	        return "Total Wages of an employee in " +companyName + " company is : " + totalEmpWage + "\n";
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome To Employee Wage Computation Program");
	        EmployeWageBuilder infosys = new EmployeWageBuilder("Infosys", 150, 2, 10);
	        EmployeWageBuilder tcs = new EmployeWageBuilder("TCS" , 200, 3, 10);
	        EmployeWageBuilder accenture = new EmployeWageBuilder("Accenture", 100, 4, 12);
	        infosys.computeWage();
	        System.out.println(infosys);
	        tcs.computeWage();
	        System.out.println(tcs);
	        accenture.computeWage();
	        System.out.println(accenture);
	    }
}
