
package com.mycompany.java_practice_questions;

public class Print_pattern2 {
    public static void main(String[] args) {
        
        //print pattern--------------------------------------------
//        ****
//        ***
//        **
//        *


       
       for(int i=0; i<4; i++){
           for(int j=0; j<4-i; j++){
               System.out.print("*");
           }
           System.out.println();
       }


    }
}
