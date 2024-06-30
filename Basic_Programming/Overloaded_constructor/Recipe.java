
package com.mycompany.oop.Overloaded_constructor;

public class Recipe {
    
    String bread;
    String tea;
    String rice;
    String dosa;
    String tomato;

    public Recipe(String bread,String tea,String rice,String dosa,String tomato) {
        
        this.bread = bread;
        this.tea = tea;
        this.rice = rice;
        this.dosa = dosa;
        this.tomato = tomato;
    }
    
      public Recipe(String bread,String tea,String rice,String dosa) {
        
        this.bread = bread;
        this.tea = tea;
        this.rice = rice;
        this.dosa = dosa;
       
    }
      
         public Recipe(String bread,String tea,String rice) {
        
        this.bread = bread;
        this.tea = tea;
        this.rice = rice;
        
       
    }
    
    
    
}
