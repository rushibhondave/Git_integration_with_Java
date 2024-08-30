package com.demo.DAO;

public class Reaopted {


	    public static void main(String[] args) {
	        String input = "AAHGTAA";  // Input string

	        
	        char []ch=input.toCharArray();
	   
	        int countA = 0;
	        int countT = 0;

	        for (int i=0;i<=ch.length;i++) {
	            if (ch[i] == 'A') {
	                countA++;
	            } else if (ch[i] == 'T') {
	                countT++;
	            }
	        }

	   
	        if (countA > countT) {
	            System.out.println("No");
	        } else {
	            System.out.println("Yes");
	        }
	    }
	}
