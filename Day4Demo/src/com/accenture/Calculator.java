package com.accenture;

public abstract class Calculator extends BaseEntity
{
	String message;
	public Calculator() 
	{
		System.out.println("Calculator initialized");
	}
	public Calculator(String message) 
	{
		this.message=message;
		System.out.println("Calculator initialized");
	}
	public abstract int compute(int x,int y);//method declaration.. abstract method
	public abstract void showSomething();//abstract method
	public void displayInfo() //non abstract method - instance method
	{
		System.out.println("This is Calculator class... An abstract class created by @Author Kausar");
	}
	public static void staticMethod()//non-abstract - static method
	{
		System.out.println("Inside static method");
	}
	/*@Override
	void helloAbstract()
	{
		System.out.println("implemented");
	}*/
	
}
