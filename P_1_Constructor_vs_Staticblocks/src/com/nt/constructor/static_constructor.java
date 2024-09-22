package com.nt.constructor;

class Test
{
	public Test()
	{
		System.out.println("Test:0-param constructors");
	}
	static {
		System.out.println("Test:static block");
	}
}

class Demo
{
	public Demo()
	{
		System.out.println(" Demo 0-param constructors");
	}
	
	static {
		System.out.println("Demo:static block");
	}
}

public class static_constructor {
	
	public static void main(String[] args)
	{
		
		Demo demo=new Demo();
		Demo d1emo=new Demo();
		
	}

}
