package com.listconcept;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input");
		int n= scan.nextInt();
		scan.nextLine();
		HashMap<String,Integer> book= new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++)
		{
			String name=scan.nextLine();
			int phNo=scan.nextInt();
			book.put(name, phNo);
			scan.nextLine();
		}
		while(scan.hasNext())
		{
			String s= scan.nextLine();
			if(book.containsKey(s))
			{
				System.out.println(s+ " : " +book.get(s));
			}
			else
			{
				System.out.println("phone number not found");
			}
		}
		scan.close();
	}
}
