package com.bridgelabzday4;

import java.util.Scanner;

public class leepYear 
{
	public static void main(String[] args) 
	{
		int year ;
		System.out.println("Enter the Year ::");
		Scanner in = new Scanner (System.in);
		year = in.nextInt();
		
		boolean leap = false;

		if (year % 4 == 0) 
		{
			if (year % 100 == 0) 
			{
				if (year % 400 == 0)
				{
					leap = true;
				}
				else
					leap = false;
			}
			else
				leap = true;
		}
		else
			leap = false;
	}
}
