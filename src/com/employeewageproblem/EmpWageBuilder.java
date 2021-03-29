package com.employeewageproblem;

/*
@description: this class is calculate wage for multiple
companies by implementing interface.

@parameters:addCompanyWage() to add company to an array.
computeEmpWage() method to calculate emp wage for company.
*/

public class EmpWageBuilder implements IComputeEmpWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private EmployeeWageComputation [] companyEmpWagwArray;
	private int numOfComapany;
	
	public EmpWageBuilder()
	{
		companyEmpWagwArray = new EmployeeWageComputation[5];
	}
	// to add companies to an array
	public void addCompanyWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		companyEmpWagwArray[numOfCompany] = new EmployeeWageComputation(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;

	}

	// to calculate emp wage for all companies
	public void computeEmpWage()
	{
		for(int i = 0; i < numOfCompany; i++)
		{
			companyEmpWagwArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagwArray[i]));
			System.out.println(companyEmpWagwArray[i]);
		}
	}

	// to calculate total wage and total working days till max hrs or max days is reached
	public int computeEmpWage(EmployeeWageComputation companyEmpWage)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		//computation
		while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays  < companyEmpWage.numOfWorkinDays)
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
			System.out.println("Days: " + totalWorkingDays + " Emp Hrs " + empHrs);
		}
		return totalEmpHrs = companyEmpWage.empRatePerHour;
	}
	public static void main(String[] args) {
		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyWage("DMart", 20, 10, 2);
		empWageBuilder.addCompanyWage("Reliance", 10, 4, 2);
		empWageBuilder.computeEmpWage();
	}
	
}
