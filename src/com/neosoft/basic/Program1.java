package com.neosoft.basic;

import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0;
		
		while(num!=0) {
			rem=num%10;
			sum=(sum * 10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" Number is Palindrome");
		}
		else {
			System.out.println(temp+" Number is not Palindrome");
		}
	}

}
