package com.javaprogram.employeewage;


import java.util.*;

public class EmployeeWage {

	private static final int present=1;
	private static final int absent=0;

	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage computation program");
		Random random=new Random();
		int attendance=random.nextInt(2);
		if(attendance == present)
		{
			System.out.println("Present "+attendance);
		}
		else
		{
			System.out.println("absent "+attendance);
		}
	}

}
