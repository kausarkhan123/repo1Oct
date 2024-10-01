package com.accenture;

public class TestAbstraction {

	public static void main(String[] args) 
	{
		//Calculator c=new Calculator();
		Addition add=new Addition("Good Morning");
		/*System.out.println("Addition: "+add.compute(450, 670));
		add.showSomething();*/
		Subtraction sub=new Subtraction();
		/*System.out.println("Subtraction: "+sub.compute(4500, 670));
		sub.showSomething();
	*/	
		//add.displayInfo();
		//sub.displayInfo();
		//add.staticMethod();
		//sub.staticMethod();
		//Calculator.staticMethod();
		add.baseMethod();
		sub.baseMethod();
	}

}
