package com.mycompany.data_structure;

import java.util.Scanner;

public class Reverse_Array {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the  size:");
        int n = obj.nextInt();
        String[] arr = new String[n];
      
        System.out.println("Enter the arrys element  " + n + " :");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.next();

        }
          char rev = 0;
         for(int i=0;i<n;i++)
        {
             rev = arr[i].charAt(i);
        }
         
         System.out.println("  Revese arrys element   :"+rev);
        
//        int temp;
//        
//        for(int i=0;i<n;i++)
//        {
//            temp=arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=temp;
//            
//            if(i!=n-1)
//            {
//                    System.out.println("  Revese arrys element   :"+arr[i]);
//            }
//            
//         
//        }

        

    }

}
