package com.demo.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> plist=new ArrayList<>();
		
		System.out.println("Enter the Number (enter 's' for finish)");
		while(sc.hasNext())
		{
			int i=sc.nextInt();
			if(i==10)
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


