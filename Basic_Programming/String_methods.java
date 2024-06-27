
package com.chiragha.SelectionDemo ;

public class String_methods {
     public static void main(String[] args){
         String name = "shivi";
        boolean result = name.equals("shivi"); //result shows true
       int result = name.length();  //5
           boolean result = name.equals("Shivi"); //show false coz case-sensitive
           char result = name.charAt(0);  //s
          
          int result = name.indexOf("s"); //0
         boolean result = name.isEmpty();  //false
        
       String result = name.toUpperCase();  //SHIVI
        String result = name.replace('s', 'h');//hhivi
         System.out.println(result);
     }
}
