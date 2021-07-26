package com.neosoft.basic;

import java.util.Scanner;

class Project{
	int pid;
	String pname;
	String plocation;
	public Project(int pid, String pname, String plocation) {
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
}

public class Employee {
	
	int eid;
	String name;
	long sal;
	String project;
	public Employee(int eid, String name, long sal, String project) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.project = project;
	
	}
	void display() {
		System.out.println("Employee Id : "+eid+" Name : "+name+" Salary : "+sal+" Project : "+project);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Project[] p=new Project[2];
		Employee[] e=new Employee[3];
		Project project = null;
		int pid;
		String pname;
		String plocation;
		System.out.println("Enete the Project Details : ");
		
		for(int i=0;i<2;i++) {
			System.out.println("Enete the Project Id : ");
			pid=sc.nextInt();
			System.out.println("Enete the Project Name : ");
			pname=sc.next();
			System.out.println("Enete the Project Location : ");
			plocation=sc.next();
			project=new Project(pid, pname, plocation);
			p[i]=project;
		}
		int eid;
		String name;
		long sal;
		Employee e1;
		for(int i=0;i<3;i++) {
			System.out.println("Enete the Employee Details : ");
			System.out.println("Enete the Employee Id : ");
			eid=sc.nextInt();
			System.out.println("Enete the Employee Name : ");
			name=sc.next();
			System.out.println("Enete the Employee Salaray : ");
			sal=sc.nextLong();
			e1=new Employee(eid, name, sal,project.pname);
			e[i]=e1;
		}
		for(int i=0;i<3;i++) {
			if(e[i].sal>25000) {
				e[i].display();
			}
		}
	}

}
