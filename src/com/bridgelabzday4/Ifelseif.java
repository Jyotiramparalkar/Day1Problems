package com.bridgelabzday4;

public class Ifelseif 
{

	public static void main(String[]args)
	{
		int money = 150;
		if(money < 50)
		{ 
			System.out.print("selection piggbany no 1");
		}

		else if(money>=50 && money<100 ) 
		{
			System.out.print("selection piggbany no 2");
		}
		else if (money > 100) 
		{ 
			System.out.print("selection piggbany no 3");
		}
		else { System.out.println("fail");
		}
	}

}

