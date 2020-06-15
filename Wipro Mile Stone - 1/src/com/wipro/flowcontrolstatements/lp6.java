package com.wipro.loops;
public class lp6 {
public static void main(String[] args) {
String gender = args[0];
int age = Integer.parseInt(args[1]);
if(gender.equals("Male")){
	if(age>0 && age<59)
	System.out.println("The Percentage of Interest is 8.4%");
	else  
	System.out.println("The Percentage of Interest is 10.5%");
	}
if(gender.equals("Female")) {
	if(age>0 && age<58) 
	System.out.println("The Percentage of Interest is 8.2%");
	else
	System.out.println("The Percentage of Interest is 9.2%");
	}
}
}