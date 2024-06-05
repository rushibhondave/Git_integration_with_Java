/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.TestMain;

import com.demo.beans.Frequency_Characters;
import com.demo.beans.Frequency_Characters;
import com.demo.beans.Lowercase_to_Uppercase;
import com.demo.beans.Remove_Characters;
import com.demo.beans.Remove_Space;
import java.util.Scanner;

/**
 *
 * @author Rushikesh Bhondave
 */
public class String_Problems {

    public static void main(String[] args)
    {
           Scanner obj = new Scanner(System.in);
         System.out.println("Enter the choice 1.Count Character 2. Remove Characters  3 . Lowercase_to_Uppercase  4.Remove_Space");
         int Ch=obj.nextInt();
         
         switch (Ch) {
            case 1 ->
            {
                Frequency_Characters.CountChar();
                break;
            }
            
             case 2 ->
            {
                 Remove_Characters. RemoveCharacters1();
                break;
            }
            
              case 3 ->
            {
                 Lowercase_to_Uppercase. Lowercase_to_Uppercase1();
                break;
            }
            
                 case 4 ->
            {
                 Remove_Space. Remove_Space1();
                break;
            }
            
            
            default -> throw new AssertionError();
        }
        
    }
}
