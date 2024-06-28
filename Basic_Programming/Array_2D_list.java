//2D array list= a dynamic list of lists;
// can change the size of these list during runtime.


package com.chiragha.SelectionDemo;

import java.util.ArrayList;

public class Array_2D_list {
    public static void main(String[] args){
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakery = new ArrayList();
        bakery.add("samosa");
        bakery.add("Chaat");
        bakery.add("Dosa");
        bakery.add("Ice-cream");
        
      //  System.out.println(bakery);
        //System.out.println(bakery.get(0));
        
        
        
        ArrayList<String> produce = new ArrayList();
        produce.add("oil");
        produce.add("salt");
        produce.add("peppers");
        produce.add("sugar");
        
       // System.out.println(produce);
        
        
        ArrayList<String> drink = new ArrayList();
        drink.add("Juice");
        
        
      //  System.out.println(drink);
      
      groceryList.add(bakery);
      groceryList.add(produce);
      groceryList.add(drink);
        
      System.out.println(groceryList);
      System.out.println(groceryList.get(0));
      System.out.println(groceryList.get(0).get(0));
    }
}
