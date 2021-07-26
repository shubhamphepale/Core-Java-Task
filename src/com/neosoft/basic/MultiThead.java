package com.neosoft.basic;
class Thread1 extends Thread{
	String str="Java is nice";
	public void run() {
		// TODO Auto-generated method stub
		for(int i=str.length();i>0;--i) {
			System.out.print(str.charAt(i-1));
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread{
	String str="Java is nice";
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i+=2) {

			System.out.print(str.charAt(i));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThead{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub=
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		System.out.println("Thread 1");
		t1.start();
		t1.join();
		System.out.println("Thread 2");
		t2.start();
		t2.join();
	}	
}
