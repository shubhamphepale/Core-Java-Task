package com.neosoft.basic;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("Befor Swapping the elements : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int min=array[0];
		int max=array[1];
		for(int i=0;i<n;i++) {
			if(array[i]<min) {
				min=array[i];
				
			}
		}
		System.out.println("Min Element from Array = "+min);
		for(int i=0;i<n;i++) {
			if(array[i]<min && array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Max Element from Array = "+max);
		int minIndex = 0, maxIndex = 0;
	    for (int i = 0; i < n;i++) {
	        if (array[i] < array[minIndex])
	            minIndex = i;
	        if (array[i] > array[maxIndex])
	            maxIndex = i;
	    }
	    int temp;
	    if (maxIndex != minIndex) {
	    	temp = array[minIndex];
	        array[minIndex] = array[maxIndex];
	        array[maxIndex] = temp;
	    }
	    System.out.print("After Swapping Array is : ");
	    for(int i=0;i<n;i++) {
	    	System.out.print(array[i]+" ");
	    }
	}

}
