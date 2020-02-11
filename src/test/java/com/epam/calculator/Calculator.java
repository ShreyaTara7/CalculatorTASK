package com.epam.calculator;
import java.util.*;
class addition
{
	int a,b;
	addition(int n1,int n2)
	{
		a=n1;
		b=n2;
	}
	long sum()
	{
		return a+b;
	}
}

class subtract
{
	int a,b;
	subtract(int n1,int n2)
	{
		a=n1;
		b=n2;
	}
	int difference(int a,int b)
	{
			return a-b;
	}
}
class multiply
{
	int a,b;
	multiply(int n1,int n2)
	{
		a=n1;
		b=n2;
	}
	long product(int a,int b)
	{
		return a*b;
	}
}
class divide
{
	float a,b;
	divide(float n1,float n2)
	{
		a=n1;
		b=n2;
	}
	boolean quotient(float a,float b)
	{
	if(b!=0)
		{
		System.out.println(a/b);
		return true;
		}
	else 
		{
		System.out.println("number can't be divided by zero");
		return false;
		}
	}
}

class calculator
{
	public static void main(String z[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers on whcih operations are to be performed");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Select an operation from the following :");
		System.out.println("1.Addition\n2.Subtract\n3.Multiply\n4.Divide\n ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			addition a=new addition(n1,n2);
			System.out.println("The sum of above 2 numbers is :" +a.sum());
			break;
		case 2:
			subtract s=new subtract(n1,n2);
			System.out.println("The difference of above 2 numbers is :"+s.difference(n1,n2));
			break;		
			
		case 3: 
			multiply m=new multiply(n1,n2);
			System.out.println("The product of above 2 numbers is :"+m.product(n1,n2));
			break;
		case 4:
			divide d=new divide(n1,n2);
			System.out.println("The status of above operation is as :" + d.quotient(n1,n2));
			break;
			
		
		}
	}
}
