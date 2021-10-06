package employewage;

import java.util.Random;
/**
 * @author Sreekanth
 * 
 * Purpose -  To declare a part-time employee and calculate the daily wage of an Employee
 */
public class EmployeWageBuilder {
	
	public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        // Declaring a constant
        int IS_FULLTIME = 1;
        int IS_PARTTIME = 2;
        int Emp_Rate_PerHr = 20;
        // Declaring a variables
        int empHrs = 0;
        int empWage = 0;
        /*
         * Using Math.random method to generate random numbers 0, 1 and 2
         */
        Random random = new Random();
        int empCheck = random.nextInt(3);
        if (empCheck == IS_FULLTIME)
            empHrs = 8;
        else if (empCheck == IS_PARTTIME)
            empHrs = 4;
        else
            empHrs = 0;
        /*
         * Calculating the daily employee wage of an employee
         */
        empWage = Emp_Rate_PerHr * empHrs;
        System.out.println("The daily wage of an employee is : " + empWage);
    }
}
