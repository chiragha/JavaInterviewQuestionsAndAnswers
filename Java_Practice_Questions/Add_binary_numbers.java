
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Add_binary_numbers {
    public static void main(String[] args) {
        int x, y;
        int dig1, dig2, carry =0, sum =0, i;
        int[] arr = new int[20];
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter First binary number- ");
         x = scan.nextInt();
         
         System.out.println("Enter Second binary number- ");
         y = scan.nextInt();
         
         
         
         for(int j= arr.length-1; j>=0; j-- ){
             dig1 = x%10;
             dig2 = y%10;
         
               x = x/10;
               y=y/10;
               sum = dig1 + dig2 + carry;
         
         if(sum ==0){
            arr[j] = 0;
            carry=0;
         }else if(sum==1){
              arr[j] = 1;
            carry=0;
         }else if(sum == 2){
              arr[j] = 0;
            carry=1;
         }else if(sum == 3){
              arr[j] = 1;
              carry=1;
         }
         }
         
       for(int j=0; j<arr.length; j++){
           System.out.print(+arr[j]);
       }
         
    }
    
}
