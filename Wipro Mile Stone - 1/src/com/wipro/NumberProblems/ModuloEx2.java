package com.wipro.NumberProblems;


public class ModuloEx2 {
	int numberOfDigits(int a) {
		int c=0,x;
		while(a!=0)
		{  x=a%10;
			c=c+x;
			a=a/10;
		}return c;
	}
	public static void main(String args[])
	{
		ModuloEx2 m=new ModuloEx2();
		int out=m.numberOfDigits(Integer.parseInt(args[0]));
		System.out.println(out);
	}

}