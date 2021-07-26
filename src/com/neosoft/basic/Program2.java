package com.neosoft.basic;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int row=sc.nextInt();
		int num=1,space;
		for(int i=1;i<=row;i++) {
			for(space=1;space<=(row-i);space++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
		
	}

}
