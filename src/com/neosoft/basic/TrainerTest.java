package com.neosoft.basic;

import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.basic.BasicListUI;

public class TrainerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Trainer> list=new LinkedList<Trainer>();
		
		list.add(new Trainer(101,"Sandy","Java",20000));
		list.add(new Trainer(102,"John","Angular",30000));
		list.add(new Trainer(103,"Sam","Python",35000));
		list.add(new Trainer(104,"Sammy","Java",40000));
		list.add(new Trainer(105,"Neel","Java",50000));
		System.out.println("***********All Trainer Info***********");
		for(Trainer t1 : list) {
			System.out.println("Id : "+t1.trid+" Name : "+t1.name+" Course : "+t1.course+" Salary : "+t1.salary);
		}
		
		LinkedList<Trainer> newlist=new LinkedList<Trainer>();
		for(Trainer t : list) {
			if(t.salary > 20000 && t.course=="Java") {
				newlist.add(t);
			}
		}
		System.out.println("\n***********Only Java Trianers***********");
		for(Trainer t2 : newlist) {
			System.out.println("Id : "+t2.trid+", Name : "+t2.name+", Course : "+t2.course+", Salary : "+t2.salary);
		}
		
	}

}
class Trainer{
	int trid;
	String name;
	String course;
	long salary;
	public Trainer(int trid, String name, String course, long salary) {
		super();
		this.trid = trid;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	
	
}