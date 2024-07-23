
package com.mycompany.java_practice_questions;

import java.util.HashSet;

public class DuplicateEle_HashSet {
    public static void main(String[] args) {
        String[] my_arr = {"Red","Blue","Green","Black","White","Orange","Green","Red","Orange","Blue",};
        int flag =0;
        
        HashSet <String> hset = new HashSet<String>();
        
        for(int i=0; i<my_arr.length -1; i++){
            
//            if((hset.add(my_arr[i])) == false){
                if(!(hset.add(my_arr[i]))){
                System.out.println("Duplicate Value is "+ my_arr[i]+ " at " + i+"th " +"index");
            }
        }
        }
    }
    
