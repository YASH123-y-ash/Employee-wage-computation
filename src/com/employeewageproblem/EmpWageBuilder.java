package com.employeewageproblem;

/*
@description: this class is calculate wage for multiple
companies by implementing interface and using LinkedList.

@parameters:addCompanyWage() to add company to an linkedList.
computeEmpWage() method to calculate emp wage for company.
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private static EmpWageBuilder IComputeEmpWageBuilder;

	private int numOfCompany = 0;
	private LinkedList<EmployeeWageComputation> companyEmpWageList;
	private Map<String,EmployeeWageComputation> companyToEmpWageMap;

	public EmpWageBuilder() 
	{
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	//to add company employee wage to list
	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		// TODO Auto-generated method stub
		EmployeeWageComputation companyWage = new EmployeeWageComputation(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyWage);
		companyToEmpWageMap.put(company, companyWage);
	}
	// to get employee wage for a company
	@Override
	public void computeEmpWage() {
		// TODO Auto-generated method stub
		for(int i = 0; i < companyEmpWageList.size(); i++)
		{
			EmployeeWageComputation companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
		}
	}

	@Override
	public int getTotalWage(String company) {

		return  companyToEmpWageMap.get(company).totalEmpWage;
	}

	//to calculate employee wage for a company till max days or max hrs is reached

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
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage for DMart company: " + empWageBuilder.getTotalWage("DMart"));
		System.out.println("Total wage for Reliance company: " + empWageBuilder.getTotalWage("Reliance"));

	}

}


