package com.employeewageproblem;

/*
@description: program to calculate total wage of 
an employee for different companies

@method: defining a method computeEmpWage() to calculating 
total wage for each company
 */

public class EmployeeWageComputation {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;	

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkinDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkinDays = numOfWorkingDays;
	}

	public void computeEmpWage()
	{
		//variables
		int empHrs = 0 , totalEmpHours =0 , totalWorkingDays = 0;

		//computation
		while(totalEmpHours < maxHoursPerMonth && totalWorkingDays < numOfWorkinDays )
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch(empCheck)
			{
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHours += empHrs;
			System.out.println("Day:: "+totalWorkingDays+ " Emp Hrs:: "+totalEmpHours);
		}
		
		totalEmpWage = totalEmpHours * empRatePerHour;
	}

	public String toString()
	{
		return "Total wage for company "+ company+ " is " + totalEmpWage;
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation dMart = new EmployeeWageComputation("Dmart" , 20, 2, 10);
		EmployeeWageComputation reliance = new EmployeeWageComputation("Reliance" , 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);


	}
}
