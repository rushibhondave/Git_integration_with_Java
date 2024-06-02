
package com.mycompany.data_structure;

import java.util.Scanner;


public class String_Que
{

    public static void main(String[] args)
    {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter the name : :");
            String name=obj.nextLine();
           String myname="Aarti is girl";
        /********************Find a string length********************/
             int length = name.length(); 
             System.out.println("Name is :"+name);
             System.out.println("length is :"+length);
            
             String replace = name.replace(myname,name);
             System.out.println("replace :"+replace);
             
         
             
    }
   

}

