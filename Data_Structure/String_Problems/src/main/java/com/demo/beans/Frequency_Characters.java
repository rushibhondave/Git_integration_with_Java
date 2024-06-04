package com.demo.beans;

import java.util.Scanner;

public class Frequency_Characters {

    public static void CountChar() 
    {
        Scanner obj = new Scanner(System.in);
        
        int [] count=new int [256];
 
        System.out.println("Enter the String");
        String str=obj.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
            count[ str.charAt(i)]++;
        }
        
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>0)
            {
                 System.out.println((char)i + ": " + count[i]);
            }
                
        }
        System.out.println(str);

    }

}
