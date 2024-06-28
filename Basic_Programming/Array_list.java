// A resizeable array
   // elements can be added and removed after compilation phase
//   store reference data types

package com.chiragha.SelectionDemo;

import java.util.ArrayList;

public class Array_list {
     public static void main(String[] args){
           
         ArrayList<String> food = new ArrayList<String>();
         
         food.add("pizza");
         food.add("burger");
         food.add("Hotdog");
         
         food.set(0,"sushi");
         food.remove(2);
         food.clear();
         
         for(int i=0; i<food.size(); i++){
             System.out.println(food.get(i));
         }
         
     }
    
}
