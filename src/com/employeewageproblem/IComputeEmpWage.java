package com.employeewageproblem;

public interface IComputeEmpWage {
	
	public void addCompanyEmpWage(String company, int empRatePerHpur, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
