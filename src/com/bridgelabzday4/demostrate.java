package com.bridgelabzday4;

public class demostrate
{
	   static int x = 10;
	   static int y;
	   static void function(int z)
	   {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static
	   {
	      System.out.println(" static initialization ::");
	      y = x + 5;
	   }
	   public static void main(String args[]) 
	   {
	      function(3);
	   }
	}