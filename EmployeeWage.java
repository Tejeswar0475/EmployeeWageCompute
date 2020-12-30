package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {

	private static final int present=1;
	private static final int absent=0;

	public static void main(String[] args) {
		final int wagePerHour=20;
		int fullTimePresent=2;
		int partTimePresent=1;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;

		System.out.println("Welcome to employee wage computation program");
		Random random=new Random();
		int attendance=random.nextInt(3);
		if(attendance == fullTimePresent)
		{
			System.out.println("Employee is present full time:"+attendance);
	     	dailyEmpWage=fullTimeHour*wagePerHour;
     		System.out.println("Daily Emp wage:" +dailyEmpWage);
		}
		else if(attendance == partTimePresent)
		{
			System.out.println("Employee is present half time:"+attendance);
    		dailyEmpWage=partTimeHour*wagePerHour;
    		System.out.println("Daily Emp Wage:"+dailyEmpWage);
		}
		else
		{
			System.out.println("Employee is absent:"+attendance);
    		dailyEmpWage=absent*wagePerHour;
      		System.out.println("Employee is absent:" +dailyEmpWage);
		}
	}

}
