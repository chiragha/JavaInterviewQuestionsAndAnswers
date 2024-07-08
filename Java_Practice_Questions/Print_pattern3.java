
package com.mycompany.java_practice_questions;

public class Print_pattern3 {
    public static void main(String[] args) {
//        ****
//         ***
//          **
//           *



       for(int i=0; i<4; i++){   //rows
           
           //space
           for(int s=0; s<=i; s++){
               System.out.print(" ");
           }
           for(int j=0; j<4-i; j++){
               System.out.print("*");
           }
           System.out.println();
       }


    }
    }

