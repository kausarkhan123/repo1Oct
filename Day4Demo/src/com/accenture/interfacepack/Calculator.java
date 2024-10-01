package com.accenture.interfacepack;

public interface Calculator 
{
public int compute(int x,int y);//abstract methods
/*void show()
{
	//non abstract methods are not allowed in interfaces
}*/
public default void defaultMethod() //default methods allowed in JDK >=8
{
	//only child class instance can have access of default method
	System.out.println("Default methods");
}
public static void staticMethod()//static methods allowed in JDK>=8
{
	//only accessible by interface
	System.out.println("Static method");
}
}
