package com.neosoft.basic;

public class SharedResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SharedResource s= new SharedResource();
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		m1.start();
		System.out.println("Thread 1");
		m1.doPrint(2, 5);
		m2.start();
		System.out.println("\nThread 2");
		m2.doPrint(3, 7);
		
	}

}
class MyThread extends Thread{

	synchronized void doPrint(int i,int j) {
		int count=0;
		if(i<j) {
			for(int k=i;k<=10;k++) {
				count++;
				if(count<=j+1) {
					System.out.print(k+" ");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}