package com.accenture;

public class Addition extends Calculator
{	
	public Addition() {
		super();
		System.out.println("Addition instantiated");
	}
	public Addition(String message)
	{
		super(message);//calling Calculator constructor
		System.out.println("Addition instantiated");
	}

	@Override //provided implementation of compute abstract method
	public int compute(int x, int y) 
	{
		return x+y;
	}

	@Override
	public void showSomething() 
	{
		System.out.println("Greetings of the Day!!! "+message);
	}
	@Override
	void helloAbstract() 
	{}

}
