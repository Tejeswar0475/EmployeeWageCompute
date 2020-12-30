package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {

	private static final int present=1;
	private static final int absent=0;

	static int getEmpWage(int attendance,int partTimeHour,int fullTimeHour,int wagePerHour,int absent)
	{
		int temp=attendance;
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
	static int getEmpHours(int attendance,int partTimeHour,int fullTimeHour,int absent)
	 {
		 int tempHour=0;
		 switch(attendance)
	    	{
	    		case 1:
	    				tempHour=partTimeHour;
	    				break;
	    		case 2:
	    				tempHour=fullTimeHour;
	    				break;
	    		default:
	    				tempHour=absent;
	    	}

			return tempHour;
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
		int maxHoursInMonth=100;
		int totalEmpHours=0;
		int empHours=0;
		int totalEmpWage=0;
		int getWage=0;

		System.out.println("Welcome to employee wage computation program");
		while( counter != workingDayPerMonth )
        	{
        		Random random=new Random();
            		System.out.println("Day   Wage");
            		for(int i=1; i<=totalWorkingDays; i++)
            		{
            			int attendace=random.nextInt(3);
                		int wagesOfEmployee=getEmpWage(attendace, partTimeHour, fullTimeHour, wagePerHour, absent);
                		System.out.println("Day["+i+"]-"+wagesOfEmployee);
                		totalEmpHours= totalEmpHours + getEmpHours(attendace,partTimeHour,fullTimeHour,absent);
                		System.out.println("Total Hours worked in month:"+totalEmpHours);
		                getWage=getEmpWage(attendace, partTimeHour, fullTimeHour, wagePerHour, absent);
                		totalEmpWage=(totalEmpWage+getWage);
                		System.out.println("Total Salary per month according to employee attendace:" +totalEmpWage);
		        	counter++;
             		}
    		}
	}
}
