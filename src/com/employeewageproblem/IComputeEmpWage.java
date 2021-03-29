package com.employeewageproblem;

/*
@description: creating an interface to declare abstract methods
@parameters: declaring addCompanyEmpWage(), computeEmpWage() and getTotalWage()
abstract method which will implemented by EmpWageBuilder class
 */

public interface IComputeEmpWage {

	public void addCompanyEmpWage(String company, int empRatePerHpur, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
