package com.employeewageproblem;

/*
@description:This class is used calculate total wage for 
multiple companies using array object;

@parameters: defined addCompanyWage() to add company parameters
like company name, empRatePerHour, numOfworkingDays, maxHoursPerMonth
defined a computeEmpWage() to calculate total wage of company 
 */

public class EmpWageBuilderArray {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private EmployeeWageComputation [] companyEmpWagwArray;
	private int numOfComapany;

	public EmpWageBuilderArray()
	{
		companyEmpWagwArray = new EmployeeWageComputation[5];
	}
	private void addCompanyWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		companyEmpWagwArray[numOfCompany] = new EmployeeWageComputation(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;

	}

	//to calculate total wage for company
	private void computeEmpWage()
	{
		for(int i = 0; i < numOfCompany; i++)
		{
			companyEmpWagwArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagwArray[i]));
			System.out.println(companyEmpWagwArray[i]);
		}
	}

	//to calculate total wage of employee till max days or max hours reached
	private int computeEmpWage(EmployeeWageComputation companyEmpWage)
	{
		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// computation
		while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkinDays)
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
			totalEmpHrs += empHrs;
			System.out.println("day: " + totalWorkingDays+ " EmpHrs: "+empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyWage("DMart", 20, 10, 2);
		empWageBuilder.addCompanyWage("Reliance", 10, 4, 2);
		empWageBuilder.computeEmpWage();

	}

}
