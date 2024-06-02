package com.mycompany.data_structure;

import java.util.Scanner;

public class _1D_Array {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the  size:");
        int n = obj.nextInt();
        int[] arr = new int[n];

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
