package com.demo.DAO;

import java.util.Scanner;

public class Reverse_Array {

	Scanner obj = new Scanner(System.in);

	   void  ReverseArrayProblems(int[] arr2, int n2) {
		System.out.println("Enter the  size:");
		int n = obj.nextInt();
		int[] arr = new int[n], revrse;
		String name = "Rushikesh";
		System.out.println("Enter the arrys element  " + n + " :");
		for (int i = 0; i < n; i++) {
			arr[i] = obj.nextInt();

		}
		System.out.println("Enter the method 1.Swap with temp 2.CharAt 3.Revesr arrat print ");
		int ch = obj.nextInt();

		switch (ch) {
		case 1: {
			int temp;

			for (int i = 0; i < n / 2; i++) {
				temp = arr[i];
				arr[i] = arr[n - i - 1];
				arr[n - i - 1] = temp;
			}
			System.out.println("  Revese arrys element   :");
			for (int i = 0; i < n; i++) {

				System.out.println(arr[i]);
			}
		}
			break;

		case 2: {
			String rev = null;
			char c;
			for (int i = 0; i < n; i++) {
				c = name.charAt(i);
				rev += c;
			}

			System.out.println("Reverse string : " + rev);
		}
			break;

		case 3: {
			System.out.println("Original Array printed in reverse order:");
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i] + "  ");
			}
		}

			break;

		default:
			System.out.println("invalid No");

		}

	}

}
