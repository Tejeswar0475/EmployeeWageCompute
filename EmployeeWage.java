package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {

	private static final int present=1;
	private static final int absent=0;

	static int getEmpHours(int randomNumber,int partTimeHour,int fullTimeHour,int wagePerHour,int absent)
	{
		int temp=randomNumber;
		int tempWage=0;
		switch(temp)
		{
		case 1:
			int partTimeWage=partTimeHour*wagePerHour;
    			tempWage=partTimeWage;
    			break;
    		case 2:
    			int fullTimeWage=fullTimeHour*wagePerHour;
    			tempWage=fullTimeWage;
    			break;
    		default:
    			tempWage=absent;
    		}

		return tempWage;
	}
	public static void main(String[] args) {
		final int wagePerHour=20;
		int fullTimePresent=2;
		int partTimePresent=1;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;
		int workingDayPerMonth=20;
		int counter=0;
		int totalWorkingDays=20;
		int tempWage=0;

		System.out.println("Welcome to employee wage computation program");
		while( counter != workingDayPerMonth )
        {
        	Random random=new Random();
                System.out.println("Day   Wage");
                for(int i=1; i<=totalWorkingDays; i++)
                {
                	int randomNum=random.nextInt(3);
                    int wagesOfEmployee=getEmpHours(randomNum, partTimeHour, fullTimeHour, wagePerHour, absent);
                    System.out.println("Day["+i+"]-"+wagesOfEmployee);
                    counter++;
                }

    	}
	}
}
