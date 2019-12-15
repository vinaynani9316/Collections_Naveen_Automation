package com.listconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("sardar");
		al.add("valla");
		al.add("bhai");
		al.add("patel");
		
		System.out.println("***1 using foreach lambda expression***");
		
		al.forEach(print->{System.out.println(print);
		});
		
		System.out.println("***2 using iterator***");
		
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("***3 using java 8 foreach remaining ()***");
		
		it=al.iterator();
		it.forEachRemaining(show-> {System.out.println(show);});
		
		System.out.println("***4 using forEach***");
		
		for(String st: al)
		{
			System.out.println(st);
		}
		
		System.out.println("***5 using for loop index***");
		 
		for(int i=0; i<al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
        
		System.out.println("***6 using Listiterator***");
		
		ListIterator<String> list = al.listIterator(al.size()); // listiterator () can traverse from both the sides
		while(list.hasPrevious())
		{
			String s=list.previous();
			System.out.println(s);
		}
	}

}
