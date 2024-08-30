/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.beans;

/**
 *
 * @author Rushikesh Bhondave
 */
public class Remove_Characters {

    public static void RemoveCharacters1() {

        {
            String str="@Rushi>_i!@#s_bo@Y%";
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
            
            System.out.println("Remove Charcaters :" +temp);
                    
                    
            
            
        }

    }
    
}
