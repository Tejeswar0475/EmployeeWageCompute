package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {


	private static final int maxHrsInMonth=100;
    	private static final int noOfWorkDay=20;
    	private static final int empRatePerHr=20;
    	private static final int isPartTime=1;
    	private static final int isFullTime=2;
    	private static int empHrs = 0;
    	private static int totalEmpHrs = 0;
    	private static int totalWorkDay=0;
    	private static int totalEmpWage=0;

	public static void main(String arg[]) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        wageComputation();
    }
	public static void wageComputation()
	{
        	while( totalWorkDay < noOfWorkDay && totalEmpHrs <= maxHrsInMonth )
		{
        		int employee = (int) ((Math.random() * 10) % 3);
        		switch (employee)
			{
                		case isPartTime:
                    				empHrs = 4;
                    				break;
                		case isFullTime:
                    				empHrs = 8;
                    				break;
                		default:
                    				empHrs = 0;
            		}
            		totalWorkDay++;
            		totalEmpHrs = totalEmpHrs + empHrs;
            		System.out.println("Employee days:" + totalWorkDay + " Work Hours:" + totalEmpHrs);
        	}
    	totalEmpWage = ( totalEmpHrs * empRatePerHr );
    	System.out.println("Employee Total Salary is :"+ totalEmpWage);
    	}
}
