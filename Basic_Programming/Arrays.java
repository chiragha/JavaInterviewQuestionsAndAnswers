
package com.chiragha.SelectionDemo ;

public class Arrays {
    public static void main(String[] args){
        
        //type -1
        String[] arr = { "pen","prncil","box","sketch"};
        arr[0]= "black-pen";
        
        System.out.println(arr[2]);
        System.out.println(arr[0]);
        
        
        //type-2
        
        String[] thing = new String[3];
        
        
        thing[0] = "pen";
        thing[1] = "pencil";
        thing[2] = "box";
        
        
        System.out.println(thing[1]);
        
        
        
        for(int i=0; i<thing.length; i++){
            System.out.println(thing[i]);
        }
    }
}
