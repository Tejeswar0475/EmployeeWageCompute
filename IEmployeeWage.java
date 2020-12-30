package com.javaprogram.employeewage;

public interface IEmployeeWage
{
	 public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	 public void computeEmpWage();
	 public int computeEmpWage(CompanyEmpWage companyEmpWage);
	 public int getTotalWage(String company);

}

