
package com.demo.beans;

public class Lowercase_to_Uppercase {

    public static void Lowercase_to_Uppercase1()
    {
        {
            String str="RuShIkeSh Is BoY";
            String temp=" ";
            char ch=' ';
            for(int i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    ch+=32;
                     temp+=ch;
                }else
                {
                      ch-=32;
                     temp+=ch;
                }
                    
            }
            
            System.out.println("Lowercase_to_Uppercase :" +temp);
                    
                
        }
        
    }
    
}
