/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.beans;

public class capitalize_first_letter {

    public static void capitalize_first_letter1() {
        String str = "rushi is boy and smart ";
        String str1 = "and good looking ";
        String temp = " ";
        str += str1;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                ch = Character.toUpperCase(ch);
            }
            temp += ch;
        }

   

        System.out.println("capitalize_first_letter :" + temp);
        System.out.println("Append two String :" + str);
    }

}
