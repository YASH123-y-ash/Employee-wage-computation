package com.employeewageproblem;

/*
@description: class to take private instance variables
and used get and set method to access it.

@method: defining a parameterized constructor to initialize
instance variable.
Override toString method return company total employee wage.
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
