package com.employeewageproblem;

/*
 calculating total wage of an employee till 
 maximum working days 20days or max hrs 100hrs is reached
 using class method.
 */
public class EmployeeWageComputation {

	// global static variables
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NUM_WORKING_DAY = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	//method to get employee wage till max hrs or max working hrs reached
	public static int computingEmpWage()
	{
		//local variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDay = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDay < NUM_WORKING_DAY)
		{
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}

			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDay + " Emp Hr: " + empHrs);

		}

		// total salary of employee
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args)
	{

		//calling method
		computingEmpWage();

	}
}
