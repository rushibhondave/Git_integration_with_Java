package com.demo.beans;

import java.util.*;

public class DuplicateCharcater {

    public static void DuplicateCharcater() {
  
    	
    	
        String str1 = "RushikeshRameshBhondave";
        char[] str2 = str1.toCharArray();

        Map<Character, Integer> SplitWord = new HashMap<>();

        for (Character str : str2) {
            if (SplitWord.containsKey(str)) {
            	
                SplitWord.put(str, SplitWord.get(str) + 1);
                
            } else {
                SplitWord.put(str, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = SplitWord.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }

}