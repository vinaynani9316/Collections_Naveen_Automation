package com.listconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("test");
		ll.add("dev");
		ll.add("kill");
		ll.add("rpa");
		
		System.out.println("content of LinkedList :" +ll);
		
		System.out.println("****************");
		ll.addFirst("viny");
		ll.addLast("vinod");
		System.out.println("content of LinkedList :" +ll);
		
		System.out.println("****************");
		//get element
		System.out.println(ll.getFirst());
		System.out.println(ll.get(1));
		System.out.println(ll);
		
		System.out.println("****************");
		//set element
		ll.set(0, "top");
		System.out.println(ll);
		
		System.out.println("****************");
		//remove elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		
		System.out.println("****************");
		ll.remove(2);
		System.out.println(ll);
		
		//different types of printing all the values of LinkedList
		System.out.println("***********using for loop");
		
		for( int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("***********using enhanced for loop");
		
		for(String str: ll)
		{
			System.out.println(str);
		}
		
		System.out.println("***********using iterator()");
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("***********using while loop");
		
		int i=0;
		while(ll.size()>i)
		{
			System.out.println(ll.get(i));
			i++;
		}

	}

}
