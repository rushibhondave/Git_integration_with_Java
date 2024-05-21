package com.demo.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
		
		Iterator itr=plist.iterator();
		System.out.println("The Number is ::");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}
}


