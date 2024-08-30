package com.demo.DAO;

import java.util.Scanner;

public class Min_And_Max_Array {

    public static void Min_Max(int[] arr, int n) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the arrys element  " + n + " :");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();

        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Maximum no is " + max);
        System.out.println("Minmum no is " + min);

    }

}
