package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWageBuilder
{
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;

	public void wageCompute(companyEmployeeWage companyEmp)
	{
		int empHours=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		while(totalWorkingDays < companyEmp.getNoOfWorkingDay() && totalEmpHours < companyEmp.getmaxHoursInMonth())
		{
			int employeePresence=(int) ( ( Math.random()*10 ) % 3);
			switch(employeePresence)
			{
			case IS_PART_TIME:
						empHours=4;
						break;
			case IS_FULL_TIME:
						empHours=8;
						break;
			default:
						empHours=0;
			}
			totalWorkingDays++;
			totalEmpHours=totalEmpHours+empHours;
		}
		companyEmp.setTotalEmpWage(totalEmpHours*companyEmp.empRatePerHour);
		System.out.println("Employee Monthly wage of" +companyEmp.getComapanyName()+ " is " + companyEmp.getTotalEmpWage());
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage");
		EmployeeWageBuilder eWage=new EmployeeWageBuilder();
		companyEmployeeWage compEmpWage[]=new companyEmployeeWage[10];
		compEmpWage[0]=new companyEmployeeWage("Wipro",40,20,100);
		eWage.wageCompute(compEmpWage[0]);
		compEmpWage[1]=new companyEmployeeWage("Tcs",30,23,90);
		eWage.wageCompute(compEmpWage[1]);
		compEmpWage[2]=new companyEmployeeWage("Abc",29,25,99);
		eWage.wageCompute(compEmpWage[2]);
	}
}


class companyEmployeeWage
{
	public String companyName="";
	public int empRatePerHour=0;
	public int noOfWorkingDay=0;
	public int maxHoursInMonth=0;
	public int totalEmpWage=0;
	public companyEmployeeWage(String companyName,int empRatePerHour,int noOfWorkingDay,int maxHoursInMonth)
	{
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.noOfWorkingDay=noOfWorkingDay;
		this.maxHoursInMonth=maxHoursInMonth;
	}

	public String getComapanyName()
	{
		return companyName;
	}
	public int getEmpRatePerHour()
	{
		return empRatePerHour;
	}

	public int getNoOfWorkingDay()
	{
		return noOfWorkingDay;
	}
	public int getmaxHoursInMonth()
	{
		return maxHoursInMonth;
	}
	public void setTotalEmpWage(int totalEmpWage)
	{

		this.totalEmpWage=totalEmpWage;
	}
	public int getTotalEmpWage()
	{
		return totalEmpWage;
	}

}
