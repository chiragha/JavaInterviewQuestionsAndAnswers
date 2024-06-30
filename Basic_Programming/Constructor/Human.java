
package com.mycompany.oop;

public class Human {
    
    String name;
    int age;
    double weight;

    public Human(String name, int age, double weight) {
        
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    void eat(){
        System.out.println(this.name+ " is eating");
    }
}
