
package com.mycompany.java_practice_questions;

import java.util.StringTokenizer;

public class Split {
    public static void main(String[] args) {
         String x = "Java is a programming language";
         String[] str = x.split(" ");
         
        
         
         for(int i=0; i< str.length; i++){
             System.out.println(str[i]);
         }
         
          String z = "1234ABCDE5677DFGHJK98876KIIMNNBB"; 
       String[] str3 = z.split("\\d+");
         
          for(int j=0; j< str3.length; j++){
             System.out.println(str3[j]);
         }
         
    }
}
