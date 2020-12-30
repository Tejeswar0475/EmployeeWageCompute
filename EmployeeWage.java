package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {

	private static final int present=1;
	private static final int absent=0;

	public static void main(String[] args)
	{
		final int wagePerHour=20;
		int fullTimePresent=2;
		int partTimePresent=1;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;

		System.out.println("Welcome to employee wage computation program");
		Random random=new Random();
		int attendance=random.nextInt(3);
		switch(attendance)
		{
	                case 1:
               			int partTimeWage=(partTimeHour*wagePerHour);
	                	System.out.println("Part Time Employee "+partTimeWage);
	                	break;
	                case 2:

                		int fullTimeWage=(fullTimeHour*wagePerHour);
                		System.out.println("Full Time Employee "+fullTimeWage);
                		break;
	                default:
                		System.out.println("Employee Absent "+absent);
		}
	}

}
