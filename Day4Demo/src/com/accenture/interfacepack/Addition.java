package com.accenture.interfacepack;

public class Addition implements Calculator, PrintInterface{

	@Override
	public int compute(int x, int y)  //Calculator
	{
		return x+y;
	}
	@Override
	public void defaultMethod() 
	{
		System.out.println("Default methods....overridden in Addition");
	}
	@Override   //PrintInterface
	public void print(int data) 
	{
		System.out.println("You result: "+data);
		
	}


}
