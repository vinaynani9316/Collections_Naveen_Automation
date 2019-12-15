package com.listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(20);
		al.add(50);
		al.add(35);
		
		System.out.println(al.size());  //size of array
		System.out.println(al.get(3)); // index value of array
		System.out.println("*****************");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("*****************");
		
		// ArrayList<E> e= new ArrayList<>();
		ArrayList<Employee> e= new ArrayList<>();
		Employee e1=new Employee("naveen", 24,"science");
		Employee e2=new Employee("vinay", 25, "Computerscience");
		Employee e3= new Employee("vinod", 24, "chemistry");
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		Iterator<Employee> it=e.iterator();
		while(it.hasNext())
		{
			Employee emp=  it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			// System.out.println(it.next()); // it will print hashcode
		}
		
		//*****************************
		System.out.println("*****************");
        // addAll     
		ArrayList<String> ar =new ArrayList<>();
		ar.add("raj");
		ar.add("raghu");
		ar.add("ram");
		
		ArrayList<String> ar1 =new ArrayList<>();
		ar1.add("cs");
		ar1.add("math");
		ar1.add("physics");
		
		ar.addAll(ar1);
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("*****************");
		//remove all
		ar.removeAll(ar1);
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("*****************");
		//retainAll
		ArrayList<String> ar2 =new ArrayList<>();
		ar2.add("test");
		ar2.add("java");
		ar2.add("dev");
		
		ArrayList<String> ar3 =new ArrayList<>();
		ar3.add("test");
		ar3.add("aws");
		ar3.add("azure");
		
		ar2.retainAll(ar3);
		for(int i=0; i<ar2.size(); i++)
		{
			System.out.println(ar2.get(i));
		}
	} 

}
