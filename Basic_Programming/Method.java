
package com.chiragha.SelectionDemo;

public class Method {
    public static void main(String[] args){
        
        String name = "Bro";
        int age = 30;
        hello(name,age);
        hello(name, age);
        hello(name, age);
    }
    
    static void hello(String name, int age){
        System.out.println("Hello "+name + age);
    }
}
