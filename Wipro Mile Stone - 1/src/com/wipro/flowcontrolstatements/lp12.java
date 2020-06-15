package com.wipro.loops;
public class lp12 {
public static void main(String[] args) {
boolean prime = true ;
int num = Integer.parseInt(args[0]);
     for(int i=2;i<num;i++)
       {
         if(num%i==0)	
           {
	         prime=false;
	         break;
           }
       }
    if(prime==true) 
       {
	   System.out.println("Prime Number");
	   }
    else {
	       System.out.println("Not a Prime Number");
	     }
}
}