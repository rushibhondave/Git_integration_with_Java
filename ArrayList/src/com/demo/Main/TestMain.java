package com.demo.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Object> plist=new ArrayList<>();
		
		System.out.println("Enter the Number (enter 's' for finish)");
		while(sc.hasNext())
		{
			String i=sc.next();
			if(i.equals("s"))
			{
				break;
			}
			plist.add(i);
		}
		//System.out.println("The Number is ::"+plist); //give a collection
		
		ListIterator<Object> itr=plist.listIterator();
		System.out.println("The forword Number is ::");
		while(itr.hasNext())
		{
			System.out.println(itr.next());    // print forword
		}
		
		System.out.println("\nThe backword Number is ::");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());    // print backword
		}
		
		
		 
		plist.remove(0);
		
		plist.set(0, 100);
		System.out.println("The remove Number is ::"+plist);
	}
}


