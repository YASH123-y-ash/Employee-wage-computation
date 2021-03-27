package com.employeewageproblem;

/*
@description: program to calculate total wage of 
an employee for different companies

@method: defining a method computeEmpWage() to calculating 
total wage for each company
 */

public class EmployeeWageComputation {


	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkinDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkinDays = numOfWorkingDays;
	}

	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}
	public String toString()
	{
		return "Total wage for company "+ company+ " is " + totalEmpWage;
	}


}
