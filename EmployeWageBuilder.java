package employewage;

import java.util.Random;
/**
 * @author sreekanth
 * Purpose - To check whether Employee is present or absent
 */
public class EmployeWageBuilder {
	
	public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        // Declaring a constant
        int IS_FULLTIME = 1;
        /**
         * Using Math.random method to generate random numbers 0 and 1
         */
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == IS_FULLTIME)
            System.out.println("The Employee is Present");
        else
            System.out.println("The Employee is Absent");

    }
}
