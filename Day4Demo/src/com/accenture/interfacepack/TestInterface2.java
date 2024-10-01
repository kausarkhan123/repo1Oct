package com.accenture.interfacepack;
interface IOne
{
	public static final int p1=10; //by default constant public static final
}
interface ITwo
{
	int p1=50;
}
class Z implements IOne,ITwo
{
	int p1=30;
	void m1()
	{
		System.out.println("IOne: "+IOne.p1);
		System.out.println("ITwo: "+ITwo.p1);
		System.out.println("Z : "+this.p1);
	}
}
public class TestInterface2 {

	public static void main(String[] args) 
	{
		//System.out.println("IOne: "+IOne.p1);
		Z ob=new Z();
		ob.m1();
	}

}
