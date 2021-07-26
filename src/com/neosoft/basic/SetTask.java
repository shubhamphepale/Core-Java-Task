package com.neosoft.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****************HashSet**********");
      
		Set<String> hash_set= new HashSet<String>();
		hash_set.add("Java");
		hash_set.add("is");
		hash_set.add("nice");
		
		System.out.println(hash_set);
		System.out.println();
		Set<Integer> set1 = new HashSet <Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,6,9,0}));
		
		Set<Integer> set2 = new HashSet <Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,4,5,6,7,5}));
		
		//Union
		Set<Integer> union = new HashSet <Integer>(set1);
		union.addAll(set2);
		
		System.out.println("Union:"+union);
		System.out.println();
		//Intersection
		Set<Integer> intersect = new HashSet <Integer>(set1);
		intersect.retainAll(set2);
		System.out.println("Intersection:"+intersect);
		System.out.println();
		//Symmetric Difference
		Set<Integer> diff = new HashSet <Integer>(set1);
		diff.removeAll(set2);
		System.out.println("Symmetric Difference:"+diff);
		
		System.out.println("2 is there?"+diff.contains(2));
		System.out.println("Remove 0:"+diff.remove(0));
		System.out.println();
		for(Integer i:diff)
		{
			System.out.print("Element:"+i+", ");
		}
		System.out.println("With iterator:");
		Iterator<Integer> itr= diff.iterator();
		while(itr.hasNext()) {
			System.out.print("Element:"+itr.next()+", ");
		}
		System.out.println();
	
		System.out.println("*****************LinkedHashSet**********");
		System.out.println();
		Set<String> sets12 = new LinkedHashSet<String>(); 
		sets12.add("Shubham");
		sets12.add("Sandy"); 
		sets12.add("Sammy");
		sets12.add("Akki");
		sets12.add("Logan");
		
		System.out.print("Element:"+sets12);
		sets12.remove("Akki");
		System.out.print("\nElement:"+sets12);
		System.out.println();
		
		
		System.out.println("*****************TreeSet**********");
		
		Set <String> sets1  = new TreeSet<String>(); 
		sets1 .add("Shubham");
		sets1 .add("Sandy"); 
		sets1 .add("Sammy");
		sets1 .add("Akki");
		sets1 .add("Logan");
		
		System.out.print("Element:"+sets1 );
		sets1.remove("Akki");
		System.out.print("\nElement:"+sets1 );
	}

}
