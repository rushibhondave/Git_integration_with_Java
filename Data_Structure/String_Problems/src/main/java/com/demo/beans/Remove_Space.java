/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.beans;

/**
 *
 * @author Rushikesh Bhondave
 */
public class Remove_Space {

    public static void Remove_Space1() 
    {
          
        {
            String str="Rushi kesh is  Sm ar t";
            String temp=" ";
            char ch=' ';
            
            for(int i=0;i<str.length();i++)
            {
                  ch=str.charAt(i);
                if(ch>=65 && ch<=90|| ch>=97 &&ch<=122 )
                {
                     temp+=ch;
                }
            }
            
            System.out.println("Remove Space :"+temp);
                
        }
    }
    
}
