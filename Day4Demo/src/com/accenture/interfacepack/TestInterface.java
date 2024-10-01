package com.accenture.interfacepack;

public class TestInterface {

	public static void main(String[] args) 
	{
		Addition ad=new Addition();
		ad.print(ad.compute(450, 35));
		ad.defaultMethod();
		Calculator.staticMethod();
		System.out.println();
		Subtraction sub=new Subtraction();
		System.out.println("Subtraction: "+sub.compute(450, 35));
		sub.defaultMethod();
		Calculator.staticMethod();
	
		
	}

}
