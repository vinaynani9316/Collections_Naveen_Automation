package com.listconcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> h1= new Hashtable<>(); // hash table is synchronized & sequential
		h1.put(1, "vin");
		h1.put(2, "vinod");
		h1.put(3,  "raju");
		
		// clone of object
		Hashtable<Integer,String> h2= new Hashtable<>();
		
		h2 =(Hashtable<Integer, String>)h1.clone();
		
		System.out.println("values of h1" +h1);
		System.out.println("values of h2" +h2);
		
		System.out.println("************");

		//clear
		h1.clear();
		System.out.println("values of h1" +h1);
		System.out.println("values of h2" +h2);
		
		System.out.println("************");
		
		//contains value:
		
		Hashtable<Character,String> ht= new Hashtable<>();
		ht.put('A', "naveen");
		ht.put('B', "lakshman");
		ht.put('C', "ramesh");
		ht.put('C', "ramesh"); // unique key & no null values for key, no null values, no duplicate keys or values
		System.out.println("************");
		System.out.println("printing only unique elements:" +ht);
		
		
		if(ht.contains("lakshman"))
		{
			System.out.println("value found");
		}
		// print all the values using enumeration
		System.out.println("************");
		
	  Enumeration<String> e=ht.elements();
	  System.out.println("print values of ht");
	  
	  while(e.hasMoreElements())
	  {
		  System.out.println(e.nextElement());
	  }
	  
	  System.out.println("************");
	  // get all the values from hashtable -- entrySet()
	  
	  Set<Map.Entry<Character, String>> s= ht.entrySet();
	  System.out.println(s);
	
	  System.out.println("************");
	  // hash code equals
	  Hashtable<Integer, String> h3= new Hashtable<>();
		h3.put(1, "vin");
		h3.put(2, "vinod");
		h3.put(3,  "raju");
		if(h2.equals(h3))
		{
			System.out.println("both the hashcodes are equal");
		}
		// get the value from the key
		System.out.println("************");
		
		System.out.println(ht.get('A'));
		
		System.out.println("************");
		// get the hashcode of table
        System.out.println("the hash code of the table ht object is :" +ht.hashCode());	  
        System.out.println("hash code of h2:" +h2.hashCode());
        System.out.println("hash code of h3:" +h3.hashCode());
	}

}
