
package com.mycompany.oop;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human("Ram", 31, 70);
        Human human2 = new Human("Sam", 39, 79);
        System.out.println(human1.name);
         System.out.println(human2.age);
         
        human2.eat();
    }
    
}
