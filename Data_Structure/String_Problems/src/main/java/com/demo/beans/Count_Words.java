
package com.demo.beans;

public class Count_Words 
{

    public static void Count_Words1()
    {
        {
            String str="rushi is boy and smart ";
            int cnt=0;
            
            if(str==" ")
            {
                cnt++;
            }
            
            System.out.println(cnt+1);
            char ch=' ';
            int len=0;
            for(int i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                if(ch!=' ')
                {
                    len++;
                }
                    
            }
            
            System.out.println("Count each Word :"+len);
            
        }
       }
    
    
}
