package com.accenture;

public class Subtraction extends Calculator
{
	
	public Subtraction() {
		super();
		System.out.println("Subtraction instantiated");
	}

	@Override
	public int compute(int x, int y) 
	{
		return x-y;
	}

	@Override
	public void showSomething() 
	{}

	@Override
	void helloAbstract() 
	{	
	}

}
