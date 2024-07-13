
package com.mycompany.java_practice_questions;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String x = "Java is a programming language";
        StringTokenizer str = new StringTokenizer(x);
        
        
         String y = "Java, is a programming, language";
        StringTokenizer str1 = new StringTokenizer(y);
        
        String z = "1234ABCDE5677DFGHJK98876KIIMNNBB"; //NOT SUPPORTED
        StringTokenizer str3 = new StringTokenizer(z, "\\d+");
        
        while(str.hasMoreElements() ){
            System.out.println(str.nextToken());
           
        }
        
        while(str1.hasMoreElements() ){
            System.out.println(str1.nextToken(","));
        }
    }
    
}
