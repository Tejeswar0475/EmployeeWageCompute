package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {


	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	public static void main(String arg[])
	{
		System.out.println("WELCOME to EMPLOYEE WAGE Computation");
		computeEmpWage("Reliance",20,21,100);
		computeEmpWage("Dmart",22,19,110);
		computeEmpWage("V-mart",20,22,99);
		computeEmpWage("Mart",24,22,110);
		computeEmpWage("Smart",21,20,101);
	}
	public static int computeEmpWage(String company,int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth)
	{
		int empHrs=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;

		while( totalWorkingDays < numOfWorkingDays && totalEmpHours <= maxHoursPerMonth )
		{
			int empCheck = (int) ((Math.random() * 10) % 3);
			switch (empCheck)
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
            		totalWorkingDays++;
            		totalEmpHours = totalEmpHours + empHrs;
            		System.out.println("Employee days:" +totalWorkingDays+ " Work Hours:" +empHrs);
        	}
    		int totalEmpWage = ( totalEmpHours * empRatePerHour );
    		System.out.println("Total Emp wage for company:" +company+" is:" +totalEmpWage);
		return totalEmpWage;
	}
}
