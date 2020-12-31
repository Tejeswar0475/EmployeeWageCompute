package com.javaprogram.employeewage;

import java.util.*;

interface EmpWageBuilder
{
	public void wageCompute(companyEmployeeWage obj);

}


public class EmployeeWage implements EmpWageBuilder
{
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	ArrayList<Integer> empDailyMonthlyTotalWage=new ArrayList<Integer>();
	public void wageCompute(companyEmployeeWage companyEmp)
	{
		System.out.println("Now" +companyEmp.getCompanyName()+ "Employee wage Computation");

		int empHours=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int empDailyWage=0;
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
			empDailyWage=empHours*companyEmp.getEmpRatePerHour();
			empDailyMonthlyTotalWage.add(empDailyWage);
			System.out.println("Day:"+totalWorkingDays+"Wage is:"+empDailyWage);

		}
		totalEmpWage=(totalEmpHours*companyEmp.getEmpRatePerHour());
		empDailyMonthlyTotalWage.add( totalEmpWage);
		companyEmp.setTotalEmpWage(totalEmpHours*companyEmp.empRatePerHour);
		System.out.println("Employee Monthly wage of" +companyEmp.getComapanyName()+ " is " + companyEmp.getTotalEmpWage());


	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage");
		EmployeeWage eWage=new EmployeeWage();
		ArrayList<companyEmployeeWage> company = new ArrayList<companyEmployeeWage>();

		company.add( new companyEmployeeWage("ABC",40,20,100));
		eWage.wageCompute(company.get(0));

		company.add( new companyEmployeeWage("DEF", 30,22,110));
		eWage.wageCompute(company.get(1));

		company.add( new companyEmployeeWage("GHI",33,18,101));
		eWage.wageCompute(company.get(2));

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
