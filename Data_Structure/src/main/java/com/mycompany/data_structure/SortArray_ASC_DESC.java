
package com.mycompany.data_structure;

import java.util.Scanner;


public class SortArray_ASC_DESC 
{
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  size:");
        int n = obj.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the arrys element  " + n + " :");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();

        }

        System.out.println("Enter the method 1.ASC Sort 2.DESC Sort 3.Another Way ");
        int ch = obj.nextInt();

        switch (ch) {
            case 1 -> {
                int temp=arr[0];

                for (int i = 0; i < n ; i++) {
                

                }

                System.out.println("  Sorrt  arrys element by ASC   :");
                for (int i = 0; i < n; i++) {

                    System.out.println(arr[i]);
                }
            }

            default -> System.out.println("invalid No");

        }
    }
    
}
