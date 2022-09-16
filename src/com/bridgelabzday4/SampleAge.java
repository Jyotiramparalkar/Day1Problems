package com.bridgelabzday4;

public class SampleAge {

	private int ageOfPerson=10;

	public int calculateAge() {
		int age=ageOfPerson*2;
		return age;
	}
	
	public static void main(String[] args) {

		System.out.println("");
		SampleAge s=new SampleAge();
		SampleAge s2=new SampleAge();
		//int res = s.calculateAge();
		System.out.println(s.calculateAge());
		
		System.out.println(s2.calculateAge());
	}
}