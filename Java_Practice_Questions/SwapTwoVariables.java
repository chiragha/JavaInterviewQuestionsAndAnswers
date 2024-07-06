
package com.mycompany.java_practice_questions;

public class SwapTwoVariables {
    public static void main(String[] args) {
        
        int a = 15;
        int b = 13;
        int temp;
        
        System.out.println("before swaping-: "+ a + ","+ b);
        
        temp = b; // b's value is store in temp and now b is empty
         b = a; // a's value is store in b now a is empty
         a= temp; // temp's value is store in a 
         
         System.out.println("After swaping-: "+ a + ","+ b);
       
        
        
        
    }
}
