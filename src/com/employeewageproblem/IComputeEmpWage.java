package com.employeewageproblem;

public interface IComputeEmpWage {

	public void computeEmpWage();
	public int computeEmpWage(EmployeeWageComputation companyEmpWage);
	public void addCompanyWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
	
}
