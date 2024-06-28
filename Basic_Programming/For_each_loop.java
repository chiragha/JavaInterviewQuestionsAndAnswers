
package com.chiragha.SelectionDemo;

import java.util.ArrayList;

public class For_each_loop {
    
public static void main(String[] args){
       // String[] animals = {"dog", "cat", "bird", "sheep", "birds"};
    
       
       ArrayList<String> animals = new ArrayList<String>();
       
       animals.add("dog");
       animals.add("cat");
       animals.add("sheep");
       animals.add("birds");
       
       
    for(String i: animals){
    System.out.println(i);
}
}
}
