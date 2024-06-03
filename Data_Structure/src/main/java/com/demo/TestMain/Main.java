package com.demo.TestMain;

import com.mycompany.data_structure.SortArray_ASC_DESC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=5;
        int[] arr = new int[n];
   
        System.out.println("Enter the method 1.ASC Sort 2.DESC Sort 3.Another Way ");
        int ch = obj.nextInt();

        switch (ch) {
            case 1 ->
            { 
                SortArray_ASC_DESC.ASCArray(arr,n);
                break;
            } 
           
            default ->
                System.out.println("invalid No");

        }
    }

}
