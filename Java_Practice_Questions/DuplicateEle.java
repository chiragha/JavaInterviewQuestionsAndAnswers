
package com.mycompany.java_practice_questions;

public class DuplicateEle {
    public static void main(String[] args) {
        //int[] my_arr = {45,60,23,45,67,90,12,34,23,60,67}; //for integer value
        
        String[] my_arr = {"Red","Blue","Green","Black","White","Orange","Green","Red","Orange","Blue",};
        int flag =0;
        for(int i=0; i<my_arr.length -1; i++){
            for(int j=i+1; j<my_arr.length; j++){
              //  if((my_arr[i]== my_arr[j]) && (i != j)){  //for integer
                  if(my_arr[i].equals(my_arr[j]) && (i!=j)){  //for string values
                    System.out.println("Duplicate Element is " + my_arr[j] +" at "+j+"th "+" index");
                    flag =1;
                }
            }
        }
        if (flag==0) {
            System.out.println("No Duplicate Element Found");
        }
    }
}
