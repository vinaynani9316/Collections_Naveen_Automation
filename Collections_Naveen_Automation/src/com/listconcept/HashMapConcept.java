package com.listconcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args)
	{
		HashMap<Integer, String> hm =new HashMap<>();
		hm.put(2, "vinay");
		hm.put(3, "raj");
		hm.put(4, "ram");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		
		System.out.println("*********using for loop");
         
		for(Entry<Integer, String> m: hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("*******remove");
		
		hm.remove(3);
		System.out.println(hm);
		
		System.out.println("***************");
		HashMap<Integer, Employee> e= new HashMap<>(); 
		Employee e1= new Employee("vinay", 25, "computer");
		Employee e2= new Employee("raju", 27, "organic");
		Employee e3= new Employee("rakesh", 24, "stats");
		
		e.put(1, e1);
		e.put(2, e2);
		e.put(3, e3);
		
	   // traverse the map.
		
		for(Entry<Integer, Employee> m1: e.entrySet())
		{
		 int key= m1.getKey();
		 Employee em= m1.getValue();
		 System.out.println(" Employee " +key + " info ");
		 System.out.println(em.name +" " +em.age+ " " +em.dept);
			
		}
		
	}

}
