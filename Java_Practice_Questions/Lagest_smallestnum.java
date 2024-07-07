
package com.mycompany.java_practice_questions;

public class Lagest_smallestnum {
    public static void main(String[] args) {
        int[] arr = new int[]{123, 456, 78889, 67737, 99,34455888,00};
        
        int val = arr[0];
        for(int i =1; i<arr.length; i++){
           if(arr[i]>val){
                val = arr[i];
           }
        }
        System.out.println("Greatest number is " + val);
        
        
        int[] arr1 = new int[]{123, 456, 78889, 54667737, 9};
        
        int val1 = arr[0];
        for(int i =1; i<arr1.length; i++){
           if(arr1[i]<val1){
                val1 = arr1[i];
           }
        }
        System.out.println("Smallest number is " + val1);
    }
}
