package com.neosoft.basic;

import java.util.Scanner;

public class Student {
	int stid;
	String name;
	String course;
	double marks;
	public Student(int stid,String name,String course,double marks) {
		// TODO Auto-generated constructor stub
		this.stid=stid;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	public Student(int stid,String name,String Cource) {
		// TODO Auto-generated constructor stub
		this.stid=stid;
		this.name=name;
		
	}
	public Student(String course,String name,int stid) {
		// TODO Auto-generated constructor stub
		this.stid=stid;
		
		this.course=course;
		
	}
	void display() {
		System.out.println("StudentID = "+stid+" Name = "+name+" Course = "+course+" Marks = "+marks);;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] st=new Student[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Details : ");
		for(int i=0;i<5;i++) {
			System.out.println("Enter The Student ID : ");
			int stid=sc.nextInt();
			System.out.println("Enter The Name : ");
			String name=sc.next();
			System.out.println("Enter The Course : ");
			String course=sc.next();
			System.out.println("Enter The Marks : ");
			long marks=sc.nextLong();
			
			Student st1=new Student(stid, name, course, marks);
			
			st[i]=st1;
			
		}
		for(int i=0;i<5;i++) {
			if(st[i].marks>60) {
				st[i].display();
			}
		}

	}

}
