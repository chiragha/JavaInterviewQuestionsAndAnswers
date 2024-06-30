
package com.mycompany.oop;

public class Dynamic_array {
    int size;
    int capacity = 10;
    Object[] array;
    
    public Dynamic_array(){
        this.array = new Object[capacity];
    }
      public Dynamic_array(int capacity){
          this.capacity = capacity;
        this.array = new Object[capacity];
    }
}
