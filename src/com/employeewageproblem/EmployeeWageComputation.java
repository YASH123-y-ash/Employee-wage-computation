package com.employeewageproblem;

/*
@description: program to calculate total wage of 
an employee for different companies

@method: defining a method to which takes argument for a company
attributes such as company name,empRatePerHour,numOfWorkingDays
and maxHourPerMonth
 */

public class EmployeeWageComputation {

	// global static variables
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	//method to get employee wage till max hrs or max working hrs reached
	public static int computingEmpWage(String company, int empRatePerHour,
			int numOfWorkingDays, int maxHoursPerMonth)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDay = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDay < numOfWorkingDays)
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
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for company: " +company+ " is:" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args)
	{

		//calling method
		computingEmpWage("DMart", 20, 2, 10);
		computingEmpWage("Reliance", 10, 4, 20);

	}
}
