/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.TestMain;


import java.util.Scanner;

class Duplicate_Values {

    static void Duplicate_Values1() 
   {
        Scanner obj = new Scanner(System.in);
        int n=5;
        int [] arr=new int[n];
        
      
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
          int min=arr[0],temp=0;  int max=arr[0];
           for(int i=0;i<arr.length;i++)
        {
              for(int j=0;j<arr.length;j++)
              {
                      if(min>arr[i])
            {
                temp=arr[i];
             
            }
              }
        
        }

        
    }
    
}
